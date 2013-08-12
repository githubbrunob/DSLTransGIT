/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.util;

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
public class AbstractPlInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<mprolog.resource.pl.IPlInterpreterListener> listeners = new java.util.ArrayList<mprolog.resource.pl.IPlInterpreterListener>();
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
		if (object instanceof mprolog.Parenthesis) {
			result = interprete_mprolog_Parenthesis((mprolog.Parenthesis) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Operator) {
			result = interprete_mprolog_Operator((mprolog.Operator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.InfixExpression) {
			result = interprete_mprolog_InfixExpression((mprolog.InfixExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.List) {
			result = interprete_mprolog_List((mprolog.List) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.QuotedAtom) {
			result = interprete_mprolog_QuotedAtom((mprolog.QuotedAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Functor) {
			result = interprete_mprolog_Functor((mprolog.Functor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Variable) {
			result = interprete_mprolog_Variable((mprolog.Variable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Body) {
			result = interprete_mprolog_Body((mprolog.Body) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Term) {
			result = interprete_mprolog_Term((mprolog.Term) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Head) {
			result = interprete_mprolog_Head((mprolog.Head) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Clause) {
			result = interprete_mprolog_Clause((mprolog.Clause) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof mprolog.Model) {
			result = interprete_mprolog_Model((mprolog.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_mprolog_Model(mprolog.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Clause(mprolog.Clause object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Head(mprolog.Head object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Term(mprolog.Term object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Body(mprolog.Body object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Variable(mprolog.Variable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Functor(mprolog.Functor object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_QuotedAtom(mprolog.QuotedAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_List(mprolog.List object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_InfixExpression(mprolog.InfixExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Operator(mprolog.Operator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_mprolog_Parenthesis(mprolog.Parenthesis object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (mprolog.resource.pl.IPlInterpreterListener listener : listeners) {
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
	
	public void addListener(mprolog.resource.pl.IPlInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(mprolog.resource.pl.IPlInterpreterListener listener) {
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
