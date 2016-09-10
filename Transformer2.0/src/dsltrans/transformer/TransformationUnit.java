package dsltrans.transformer;

import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;

public abstract class TransformationUnit {
	private boolean _processed;
	private boolean _valid;
	private String _classdir;
	private InstanceDatabase _outputModelDatabase;
	private MetaModelDatabase _mdatabase;	
	
	
	TransformationUnit(String classdir) {
		setClassdir(classdir);
		setProcessed(false);
		setValid(true);
	}

	public void setProcessed(boolean _processed) {
		this._processed = _processed;
	}

	public boolean isProcessed() {
		return _processed;
	}
	
	public void setValid(boolean _valid) {
		this._valid = _valid;
	}

	public boolean isValid() {
		return _valid;
	}

	public abstract void Check();
	
	public void setOutputModelDatabase(InstanceDatabase _idatabase) {
		this._outputModelDatabase = _idatabase;
	}

	public InstanceDatabase getOutputModelDatabase() {
		return _outputModelDatabase;
	}

	public void setMetaDatabase(MetaModelDatabase _mdatabase) {
		this._mdatabase = _mdatabase;
	}

	public MetaModelDatabase getMetaDatabase() {
		return _mdatabase;
	}

	public void setClassdir(String _classdir) {
		this._classdir = _classdir;
	}

	public String getClassdir() {
		return _classdir;
	}
	
	public abstract String getMetamodelIdentifier();
	
}