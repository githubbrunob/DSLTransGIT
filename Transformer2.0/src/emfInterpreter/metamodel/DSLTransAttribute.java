package emfInterpreter.metamodel;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.resource.Resource;

public class DSLTransAttribute extends MetaAttribute {

	public static final String DSLTRANS_DEFAULT = "__dsltrans_default";
	
	public DSLTransAttribute() {
		super(null,new EAttribute() {
			@Override
			public Object getDefaultValue() {
				return new String(DSLTRANS_DEFAULT);
			}
			
			@Override
			public String getName() {
				return DSLTRANS_DEFAULT;
			}

			@Override
			public EDataType getEAttributeType() {
				return new EDataType() {
					@Override
					public String getInstanceTypeName() {
						return DSLTRANS_DEFAULT;
					}

					@Override
					public boolean isSerializable() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public void setSerializable(boolean value) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public int getClassifierID() {
						// TODO Auto-generated method stub
						return 0;
					}

					@Override
					public Object getDefaultValue() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EPackage getEPackage() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EList<ETypeParameter> getETypeParameters() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public Class<?> getInstanceClass() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public String getInstanceClassName() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public boolean isInstance(Object object) {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public void setInstanceClass(Class<?> value) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void setInstanceClassName(String value) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void setInstanceTypeName(String value) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public String getName() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public void setName(String value) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public EAnnotation getEAnnotation(String source) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EList<EAnnotation> getEAnnotations() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public TreeIterator<EObject> eAllContents() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EClass eClass() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EObject eContainer() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EStructuralFeature eContainingFeature() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EReference eContainmentFeature() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EList<EObject> eContents() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public EList<EObject> eCrossReferences() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public Object eGet(EStructuralFeature feature) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public Object eGet(EStructuralFeature feature,
							boolean resolve) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public boolean eIsProxy() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public boolean eIsSet(EStructuralFeature feature) {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public Resource eResource() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public void eSet(EStructuralFeature feature, Object newValue) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void eUnset(EStructuralFeature feature) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public EList<Adapter> eAdapters() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public boolean eDeliver() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public void eNotify(Notification notification) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void eSetDeliver(boolean deliver) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public Object eInvoke(EOperation operation,
							EList<?> arguments)
							throws InvocationTargetException {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}			


			@Override
			public boolean isID() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setID(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Class<?> getContainerClass() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getDefaultValueLiteral() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EClass getEContainingClass() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getFeatureID() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isChangeable() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isDerived() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isTransient() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isUnsettable() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isVolatile() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setChangeable(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setDefaultValue(Object value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setDefaultValueLiteral(String value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setDerived(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setTransient(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setUnsettable(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolatile(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public EGenericType getEGenericType() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EClassifier getEType() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getLowerBound() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getUpperBound() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isMany() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isOrdered() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isRequired() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isUnique() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setEGenericType(EGenericType value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setEType(EClassifier value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setLowerBound(int value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setOrdered(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setUnique(boolean value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setUpperBound(int value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setName(String value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public EAnnotation getEAnnotation(String source) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EList<EAnnotation> getEAnnotations() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public TreeIterator<EObject> eAllContents() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EClass eClass() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EObject eContainer() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EStructuralFeature eContainingFeature() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EReference eContainmentFeature() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EList<EObject> eContents() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EList<EObject> eCrossReferences() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object eGet(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object eGet(EStructuralFeature feature, boolean resolve) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean eIsProxy() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean eIsSet(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Resource eResource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void eSet(EStructuralFeature feature, Object newValue) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void eUnset(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public EList<Adapter> eAdapters() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean eDeliver() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void eNotify(Notification notification) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void eSetDeliver(boolean deliver) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object eInvoke(EOperation operation, EList<?> arguments)
					throws InvocationTargetException {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
	}

	@Override
	public boolean isDSLTransType() {
		return true;
	}
	
}
