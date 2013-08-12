/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.util;

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
public class AbstractSOSInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<SOS.resource.SOS.ISOSInterpreterListener> listeners = new java.util.ArrayList<SOS.resource.SOS.ISOSInterpreterListener>();
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
		if (object instanceof SOS.set.ForAllIn) {
			result = interprete_SOS_set_ForAllIn((SOS.set.ForAllIn) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.ExistsIn) {
			result = interprete_SOS_set_ExistsIn((SOS.set.ExistsIn) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.Set) {
			result = interprete_SOS_set_Set((SOS.set.Set) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.ModelClassAttribute) {
			result = interprete_SOS_set_ModelClassAttribute((SOS.set.ModelClassAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.ModelRelation) {
			result = interprete_SOS_set_ModelRelation((SOS.set.ModelRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.Intersection) {
			result = interprete_SOS_set_Intersection((SOS.set.Intersection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.Excluding) {
			result = interprete_SOS_set_Excluding((SOS.set.Excluding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.Union) {
			result = interprete_SOS_set_Union((SOS.set.Union) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.SetConstructor) {
			result = interprete_SOS_set_SetConstructor((SOS.set.SetConstructor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.SetOperator) {
			result = interprete_SOS_set_SetOperator((SOS.set.SetOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.ModelSet) {
			result = interprete_SOS_set_ModelSet((SOS.set.ModelSet) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.SetMembership) {
			result = interprete_SOS_set_SetMembership((SOS.set.SetMembership) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.SetTerm) {
			result = interprete_SOS_set_SetTerm((SOS.set.SetTerm) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.set.ModelSort) {
			result = interprete_SOS_set_ModelSort((SOS.set.ModelSort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.AbstractGenericOp) {
			result = interprete_SOS_adtmm_AbstractGenericOp((SOS.adtmm.AbstractGenericOp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.AbstractOperation) {
			result = interprete_SOS_adtmm_AbstractOperation((SOS.adtmm.AbstractOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.SortDeclaration) {
			result = interprete_SOS_adtmm_SortDeclaration((SOS.adtmm.SortDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.AtomicSort) {
			result = interprete_SOS_adtmm_AtomicSort((SOS.adtmm.AtomicSort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.AbstractSort) {
			result = interprete_SOS_adtmm_AbstractSort((SOS.adtmm.AbstractSort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.Inequation) {
			result = interprete_SOS_adtmm_Inequation((SOS.adtmm.Inequation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.Equation) {
			result = interprete_SOS_adtmm_Equation((SOS.adtmm.Equation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.AbstractEquation) {
			result = interprete_SOS_adtmm_AbstractEquation((SOS.adtmm.AbstractEquation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.CTerm) {
			result = interprete_SOS_adtmm_CTerm((SOS.adtmm.CTerm) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.VariableRef) {
			result = interprete_SOS_adtmm_VariableRef((SOS.adtmm.VariableRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.Term) {
			result = interprete_SOS_adtmm_Term((SOS.adtmm.Term) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.CondEquation) {
			result = interprete_SOS_adtmm_CondEquation((SOS.adtmm.CondEquation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.Variable) {
			result = interprete_SOS_adtmm_Variable((SOS.adtmm.Variable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.Operation) {
			result = interprete_SOS_adtmm_Operation((SOS.adtmm.Operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.Sort) {
			result = interprete_SOS_adtmm_Sort((SOS.adtmm.Sort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.adtmm.ADT) {
			result = interprete_SOS_adtmm_ADT((SOS.adtmm.ADT) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.AlgebraicConditionList) {
			result = interprete_SOS_AlgebraicConditionList((SOS.AlgebraicConditionList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.AlgebraicCondition) {
			result = interprete_SOS_AlgebraicCondition((SOS.AlgebraicCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.TypeJudment) {
			result = interprete_SOS_TypeJudment((SOS.TypeJudment) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.Transition) {
			result = interprete_SOS_Transition((SOS.Transition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.Condition) {
			result = interprete_SOS_Condition((SOS.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.Conclusion) {
			result = interprete_SOS_Conclusion((SOS.Conclusion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.PremisseList) {
			result = interprete_SOS_PremisseList((SOS.PremisseList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.Rule) {
			result = interprete_SOS_Rule((SOS.Rule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof SOS.Semantics) {
			result = interprete_SOS_Semantics((SOS.Semantics) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_SOS_Semantics(SOS.Semantics object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_Rule(SOS.Rule object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_PremisseList(SOS.PremisseList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_Conclusion(SOS.Conclusion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_Condition(SOS.Condition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_Transition(SOS.Transition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_TypeJudment(SOS.TypeJudment object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_AlgebraicCondition(SOS.AlgebraicCondition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_AlgebraicConditionList(SOS.AlgebraicConditionList object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_ADT(SOS.adtmm.ADT object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_Sort(SOS.adtmm.Sort object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_Operation(SOS.adtmm.Operation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_Variable(SOS.adtmm.Variable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_CondEquation(SOS.adtmm.CondEquation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_Term(SOS.adtmm.Term object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_VariableRef(SOS.adtmm.VariableRef object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_CTerm(SOS.adtmm.CTerm object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_AbstractEquation(SOS.adtmm.AbstractEquation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_Equation(SOS.adtmm.Equation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_Inequation(SOS.adtmm.Inequation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_AbstractSort(SOS.adtmm.AbstractSort object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_AtomicSort(SOS.adtmm.AtomicSort object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_SortDeclaration(SOS.adtmm.SortDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_AbstractOperation(SOS.adtmm.AbstractOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_adtmm_AbstractGenericOp(SOS.adtmm.AbstractGenericOp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_ModelSort(SOS.set.ModelSort object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_SetMembership(SOS.set.SetMembership object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_SetTerm(SOS.set.SetTerm object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_ModelSet(SOS.set.ModelSet object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_SetOperator(SOS.set.SetOperator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_SetConstructor(SOS.set.SetConstructor object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_Union(SOS.set.Union object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_Excluding(SOS.set.Excluding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_Intersection(SOS.set.Intersection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_ModelRelation(SOS.set.ModelRelation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_ModelClassAttribute(SOS.set.ModelClassAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_Set(SOS.set.Set object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_ExistsIn(SOS.set.ExistsIn object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_SOS_set_ForAllIn(SOS.set.ForAllIn object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (SOS.resource.SOS.ISOSInterpreterListener listener : listeners) {
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
	
	public void addListener(SOS.resource.SOS.ISOSInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(SOS.resource.SOS.ISOSInterpreterListener listener) {
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
