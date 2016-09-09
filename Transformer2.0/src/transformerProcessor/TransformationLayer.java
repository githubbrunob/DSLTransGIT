package transformerProcessor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import persistence.InstanceDatabase;
import persistence.InstanceEntity;
import persistence.ModelExporter;
import persistence.PersistenceLayer;
import transformerProcessor.exceptions.InvalidAttributeRelationException;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationRefinementLayerException;
import transformerProcessor.exceptions.UnsuportedMetamodelException;
import dsltrans.AbstractSource;
import dsltrans.FilePort;
import dsltrans.Layer;
import dsltrans.MatchModel;
import dsltrans.MetaModelIdentifier;
import dsltrans.Rule;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;

public abstract class TransformationLayer  extends TransformationUnit {
	private final Layer _layer;
	private TransformationUnit _precedingUnit;
	private MetaModelDatabase _matchMetaModel;
	private InstanceDatabase _matchModel;
	private List<TransformationRule> _rules = null;
	private final TransformationController _controller;
	private final PersistenceLayer persistenceLayer;
	
	TransformationLayer(String classdir, TransformationController tc, Layer l, PersistenceLayer persistenceL) {
		super(classdir);
		_layer = l;
		setPrecedingUnit(null);
		setMatchMetaModel(null);
		setMatchModel(null);
		setRules(new LinkedList<TransformationRule>());
		_controller = tc;
		persistenceLayer = persistenceL;
	}

	public void setRules(LinkedList<TransformationRule> linkedList) {
		_rules = linkedList;
	}
	
	public Layer getLayer() {
		return _layer;
	}
	
	public List<AbstractSource> getRequirements() {
		List<AbstractSource> requirements = new LinkedList<AbstractSource>(); 
		requirements.addAll(this.getLayer().getPreviousSource());
		for(Rule rule : this.getLayer().getHasRule()) {
			for (MatchModel mm : rule.getMatch())
				if (mm.getExplicitSource() != null) {
					requirements.add(mm.getExplicitSource());
				}
		}
		return requirements;
	}

	protected void executeRules() throws Throwable {
		System.out.println("execution rules from layer: " + this.getLayer().getDescription());
		boolean hasmatch;
		
//DEBUG
//if (this.getLayer().getDescription().equals("2nd Layer"))
//	System.out.println("");

		for(TransformationRule rule : getTransformationRules()) {
			hasmatch = true; // everytime we get a new rule we admit to have new match
			while(hasmatch) {
				hasmatch = rule.performMatch(_controller,
								this.getMatchModel(),
								this.getDatabase(),
								this.getMatchMetaModel(),
								this.getMetaDatabase()
							);
				if(hasmatch) 
					rule.performApply(this.getDatabase(), this.getMetaDatabase(), this.getMatchModel());
			}
			rule.clean();
		}
		
		for(TransformationRule rule : getTransformationRules()) {
			rule.MarkTemporalRelations(this.getDatabase());
		}
		this.getDatabase().refreshTemporals();
	}

	@Override
	public void Check() {
		// TODO Auto-generated method stub
		
	}

	public void Execute(TransformationUnit preUnit) throws Throwable {
		setProcessed(true);		
		this.setPrecedingUnit(preUnit);
		prepareInputModel();
		try {
			prepareOutputModel(_controller,getClassdir());
		} catch (TransformationRefinementLayerException e) {
			System.err.println("ERROR: RefinementLayer Output failed");
		}
		buildRules();
		Check();
		try {
			executeRules();
			output();
		} catch (SecurityException e) {
			throw new TransformationLayerException("SecurityException at:", this, e);
		} catch (IllegalArgumentException e) {
			throw new TransformationLayerException("IllegalArgumentException at:", this, e);
		} catch (ClassNotFoundException e) {
			throw new TransformationLayerException("ClassNotFoundException at:", this, e);
		} catch (NoSuchFieldException e) {
			throw new TransformationLayerException("NoSuchFieldException at:", this, e);
		} catch (IllegalAccessException e) {
			throw new TransformationLayerException("IllegalAccessException at:", this, e);
		} catch (InvocationTargetException e) {
			throw new TransformationLayerException("InvocationTargetException at:", this, e);
		} catch (NoSuchMethodException e) {
			throw new TransformationLayerException("NoSuchMethodException at:", this, e);
		} catch (InvalidLayerRequirement e) {
			throw new TransformationLayerException("InvalidLayerRequirements at:", this, e);
		} catch (IOException e) {
			throw new TransformationLayerException("IOException at:", this, e);
		} catch (InvalidAttributeRelationException e) {
			throw new TransformationLayerException("InvalidAttributeRelationException at:", this, e);
		}
	}

	protected abstract void prepareOutputModel(TransformationController control, String classdir) throws TransformationRefinementLayerException, IOException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException;

	protected abstract void prepareInputModel();

	private void buildRules() {
		System.out.println("building rules from layer: " + this.getLayer().getDescription());
		for(Rule rule : this.getLayer().getHasRule()) {
			getTransformationRules().add(new TransformationRule(this, rule));
		}
	}

	private List<TransformationRule> getTransformationRules() {
		return _rules;
	}

	public String getOutputFilePathURI() {
		return this.getLayer().getOutputFilePathURI();
	}
	
	public String getName() {
		return this.getLayer().getName();
	}
	
	public String getGroupName() {
		if(this.getLayer().getGroupName() == null)
			return "";
		return this.getLayer().getGroupName();
	}
	
	private void output() throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, IOException, InvocationTargetException, NoSuchMethodException, UnsuportedMetamodelException {
//		System.out.println("#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		this.getDatabase().dump();
//		System.out.println("#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");	
		String outputpath = getOutputFilePathURI();
		
		if (outputpath != null) {
			if(outputpath.isEmpty()) return;
		}
		else
			return;
		
		URI mmPathURI = URI.createURI(outputpath);
		
		if(mmPathURI.isRelative())
				outputpath = getClassdir()+"/"+ outputpath;
		
		if(this.getDatabase().getRootElement() == null) {
			MetaEntity rootEntity = this.getMetaDatabase().getRootEntity();
			List<InstanceEntity> ielist = this.getDatabase().getElementsByMetaEntity(rootEntity);
			if(ielist.isEmpty()) {
				System.err.println("Oops! There is nothing to output?");
				return;
			} else
				this.getDatabase().setRootElement(ielist.get(0));
		}
		ModelExporter exporter = persistenceLayer.buildModelExporter();
		exporter.setDatabases(this.getMetaDatabase(),this.getDatabase());
		MetaModelIdentifier mmi = getLayer().getMetaModelId();
		String mmName = mmi.getMetaModelName();

		exporter.saveTo(mmName + "Package", outputpath);
	}

	public InstanceDatabase getMatchModel() {
		return _matchModel;
	}

	public MetaModelDatabase getMatchMetaModel() {
		return _matchMetaModel;
	}	
	
	protected void setMatchModel(InstanceDatabase database) {
		_matchModel = database;
	}

	protected void setMatchMetaModel(MetaModelDatabase metaDatabase) {
		_matchMetaModel = metaDatabase;
	}

	public TransformationSource getTransformationSource(
			TransformationUnit precedingUnit) {
		if(precedingUnit instanceof TransformationSource) {
			return (TransformationSource) precedingUnit;
		}
		if(precedingUnit instanceof TransformationLayer) {
			return getTransformationSource(((TransformationLayer)precedingUnit).getPrecedingUnit());
		}
		return null;
	}

	public void setPrecedingUnit(TransformationUnit _precedingUnit) {
		this._precedingUnit = _precedingUnit;
	}

	public TransformationUnit getPrecedingUnit() {
		return _precedingUnit;
	}
	
	public TransformationSource getSource(FilePort as) {
		return _controller.getSource(as);
	}
	
	public String getMetamodelIdentifier() {
		MetaModelIdentifier mmi = getLayer().getMetaModelId();
		return mmi.getMetaModelName();
	}
}
