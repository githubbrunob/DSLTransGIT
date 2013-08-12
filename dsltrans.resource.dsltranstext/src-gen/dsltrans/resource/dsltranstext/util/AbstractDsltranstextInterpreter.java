/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractDsltranstextInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<dsltrans.resource.dsltranstext.IDsltranstextInterpreterListener> listeners = new java.util.ArrayList<dsltrans.resource.dsltranstext.IDsltranstextInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof dsltrans.ApplyMayBeSameRelation) {
			result = interprete_dsltrans_ApplyMayBeSameRelation((dsltrans.ApplyMayBeSameRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MatchMayBeSameRelation) {
			result = interprete_dsltrans_MatchMayBeSameRelation((dsltrans.MatchMayBeSameRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AttributeInequality) {
			result = interprete_dsltrans_AttributeInequality((dsltrans.AttributeInequality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AttributeEquality) {
			result = interprete_dsltrans_AttributeEquality((dsltrans.AttributeEquality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AbstractAttributeRelation) {
			result = interprete_dsltrans_AbstractAttributeRelation((dsltrans.AbstractAttributeRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Sequencer) {
			result = interprete_dsltrans_Sequencer((dsltrans.Sequencer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AbstractTemporalRelation) {
			result = interprete_dsltrans_AbstractTemporalRelation((dsltrans.AbstractTemporalRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.isNull) {
			result = interprete_dsltrans_isNull((dsltrans.isNull) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MatchAttributeValue) {
			result = interprete_dsltrans_MatchAttributeValue((dsltrans.MatchAttributeValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Attribute) {
			result = interprete_dsltrans_Attribute((dsltrans.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Wildcard) {
			result = interprete_dsltrans_Wildcard((dsltrans.Wildcard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.TypeOf) {
			result = interprete_dsltrans_TypeOf((dsltrans.TypeOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Concat) {
			result = interprete_dsltrans_Concat((dsltrans.Concat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.ClassRef) {
			result = interprete_dsltrans_ClassRef((dsltrans.ClassRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AttributeRef) {
			result = interprete_dsltrans_AttributeRef((dsltrans.AttributeRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Ref) {
			result = interprete_dsltrans_Ref((dsltrans.Ref) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Atom) {
			result = interprete_dsltrans_Atom((dsltrans.Atom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Operator) {
			result = interprete_dsltrans_Operator((dsltrans.Operator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Term) {
			result = interprete_dsltrans_Term((dsltrans.Term) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Sequential) {
			result = interprete_dsltrans_Sequential((dsltrans.Sequential) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Import) {
			result = interprete_dsltrans_Import((dsltrans.Import) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.NegativeBackwardRestriction) {
			result = interprete_dsltrans_NegativeBackwardRestriction((dsltrans.NegativeBackwardRestriction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.PositiveBackwardRestriction) {
			result = interprete_dsltrans_PositiveBackwardRestriction((dsltrans.PositiveBackwardRestriction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MetaModelIdentifier) {
			result = interprete_dsltrans_MetaModelIdentifier((dsltrans.MetaModelIdentifier) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Rule) {
			result = interprete_dsltrans_Rule((dsltrans.Rule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.FilePort) {
			result = interprete_dsltrans_FilePort((dsltrans.FilePort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AbstractSource) {
			result = interprete_dsltrans_AbstractSource((dsltrans.AbstractSource) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.ApplyAttribute) {
			result = interprete_dsltrans_ApplyAttribute((dsltrans.ApplyAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MatchAttribute) {
			result = interprete_dsltrans_MatchAttribute((dsltrans.MatchAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.ApplyAssociation) {
			result = interprete_dsltrans_ApplyAssociation((dsltrans.ApplyAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.NegativeIndirectAssociation) {
			result = interprete_dsltrans_NegativeIndirectAssociation((dsltrans.NegativeIndirectAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.PositiveIndirectAssociation) {
			result = interprete_dsltrans_PositiveIndirectAssociation((dsltrans.PositiveIndirectAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MatchAssociation) {
			result = interprete_dsltrans_MatchAssociation((dsltrans.MatchAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Association) {
			result = interprete_dsltrans_Association((dsltrans.Association) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.ApplyModel) {
			result = interprete_dsltrans_ApplyModel((dsltrans.ApplyModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.ApplyClass) {
			result = interprete_dsltrans_ApplyClass((dsltrans.ApplyClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AbstractClass) {
			result = interprete_dsltrans_AbstractClass((dsltrans.AbstractClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.NegativeMatchAssociation) {
			result = interprete_dsltrans_NegativeMatchAssociation((dsltrans.NegativeMatchAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.PositiveMatchAssociation) {
			result = interprete_dsltrans_PositiveMatchAssociation((dsltrans.PositiveMatchAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MatchModel) {
			result = interprete_dsltrans_MatchModel((dsltrans.MatchModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.NegativeMatchClass) {
			result = interprete_dsltrans_NegativeMatchClass((dsltrans.NegativeMatchClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.ExistsMatchClass) {
			result = interprete_dsltrans_ExistsMatchClass((dsltrans.ExistsMatchClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.AnyMatchClass) {
			result = interprete_dsltrans_AnyMatchClass((dsltrans.AnyMatchClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.PositiveMatchClass) {
			result = interprete_dsltrans_PositiveMatchClass((dsltrans.PositiveMatchClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.MatchClass) {
			result = interprete_dsltrans_MatchClass((dsltrans.MatchClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.Layer) {
			result = interprete_dsltrans_Layer((dsltrans.Layer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof dsltrans.TransformationModel) {
			result = interprete_dsltrans_TransformationModel((dsltrans.TransformationModel) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_dsltrans_TransformationModel(dsltrans.TransformationModel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Layer(dsltrans.Layer object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MatchClass(dsltrans.MatchClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_PositiveMatchClass(dsltrans.PositiveMatchClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AnyMatchClass(dsltrans.AnyMatchClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ExistsMatchClass(dsltrans.ExistsMatchClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_NegativeMatchClass(dsltrans.NegativeMatchClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MatchModel(dsltrans.MatchModel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MatchAssociation(dsltrans.MatchAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_PositiveIndirectAssociation(dsltrans.PositiveIndirectAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_NegativeIndirectAssociation(dsltrans.NegativeIndirectAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_PositiveMatchAssociation(dsltrans.PositiveMatchAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_NegativeMatchAssociation(dsltrans.NegativeMatchAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ApplyClass(dsltrans.ApplyClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ApplyModel(dsltrans.ApplyModel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ApplyAssociation(dsltrans.ApplyAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AbstractClass(dsltrans.AbstractClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Association(dsltrans.Association object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MatchAttribute(dsltrans.MatchAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ApplyAttribute(dsltrans.ApplyAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AbstractSource(dsltrans.AbstractSource object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_FilePort(dsltrans.FilePort object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Rule(dsltrans.Rule object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MetaModelIdentifier(dsltrans.MetaModelIdentifier object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_PositiveBackwardRestriction(dsltrans.PositiveBackwardRestriction object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_NegativeBackwardRestriction(dsltrans.NegativeBackwardRestriction object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Import(dsltrans.Import object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Sequential(dsltrans.Sequential object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Term(dsltrans.Term object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Operator(dsltrans.Operator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Atom(dsltrans.Atom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Ref(dsltrans.Ref object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AttributeRef(dsltrans.AttributeRef object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ClassRef(dsltrans.ClassRef object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Concat(dsltrans.Concat object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_TypeOf(dsltrans.TypeOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Wildcard(dsltrans.Wildcard object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Attribute(dsltrans.Attribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_isNull(dsltrans.isNull object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MatchAttributeValue(dsltrans.MatchAttributeValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AbstractTemporalRelation(dsltrans.AbstractTemporalRelation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_Sequencer(dsltrans.Sequencer object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AbstractAttributeRelation(dsltrans.AbstractAttributeRelation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AttributeEquality(dsltrans.AttributeEquality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_AttributeInequality(dsltrans.AttributeInequality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_MatchMayBeSameRelation(dsltrans.MatchMayBeSameRelation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_dsltrans_ApplyMayBeSameRelation(dsltrans.ApplyMayBeSameRelation object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (dsltrans.resource.dsltranstext.IDsltranstextInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(dsltrans.resource.dsltranstext.IDsltranstextInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(dsltrans.resource.dsltranstext.IDsltranstextInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
