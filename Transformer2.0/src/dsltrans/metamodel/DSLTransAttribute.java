package dsltrans.metamodel;

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
						return false;
					}

					@Override
					public void setSerializable(boolean value) {
					}

					@Override
					public int getClassifierID() {
						return 0;
					}

					@Override
					public Object getDefaultValue() {
						return null;
					}

					@Override
					public EPackage getEPackage() {
						return null;
					}

					@Override
					public EList<ETypeParameter> getETypeParameters() {
						return null;
					}

					@Override
					public Class<?> getInstanceClass() {
						return null;
					}

					@Override
					public String getInstanceClassName() {
						return null;
					}

					@Override
					public boolean isInstance(Object object) {
						return false;
					}

					@Override
					public void setInstanceClass(Class<?> value) {
						
					}

					@Override
					public void setInstanceClassName(String value) {
						
					}

					@Override
					public void setInstanceTypeName(String value) {
						
					}

					@Override
					public String getName() {
						return null;
					}

					@Override
					public void setName(String value) {
						
					}

					@Override
					public EAnnotation getEAnnotation(String source) {
						return null;
					}

					@Override
					public EList<EAnnotation> getEAnnotations() {
						return null;
					}

					@Override
					public TreeIterator<EObject> eAllContents() {
						return null;
					}

					@Override
					public EClass eClass() {
						return null;
					}

					@Override
					public EObject eContainer() {
						return null;
					}

					@Override
					public EStructuralFeature eContainingFeature() {
						return null;
					}

					@Override
					public EReference eContainmentFeature() {
						return null;
					}

					@Override
					public EList<EObject> eContents() {
						return null;
					}

					@Override
					public EList<EObject> eCrossReferences() {
						return null;
					}

					@Override
					public Object eGet(EStructuralFeature feature) {
						return null;
					}

					@Override
					public Object eGet(EStructuralFeature feature,
							boolean resolve) {
						return null;
					}

					@Override
					public boolean eIsProxy() {
						return false;
					}

					@Override
					public boolean eIsSet(EStructuralFeature feature) {
						return false;
					}

					@Override
					public Resource eResource() {
						return null;
					}

					@Override
					public void eSet(EStructuralFeature feature, Object newValue) {
						
					}

					@Override
					public void eUnset(EStructuralFeature feature) {
						
					}

					@Override
					public EList<Adapter> eAdapters() {
						return null;
					}

					@Override
					public boolean eDeliver() {
						return false;
					}

					@Override
					public void eNotify(Notification notification) {
						
					}

					@Override
					public void eSetDeliver(boolean deliver) {
						
					}

					@Override
					public Object eInvoke(EOperation operation,
							EList<?> arguments)
							throws InvocationTargetException {
						return null;
					}
				};
			}			


			@Override
			public boolean isID() {
				return false;
			}

			@Override
			public void setID(boolean value) {
				
			}

			@Override
			public Class<?> getContainerClass() {
				return null;
			}

			@Override
			public String getDefaultValueLiteral() {
				return null;
			}

			@Override
			public EClass getEContainingClass() {
				return null;
			}

			@Override
			public int getFeatureID() {
				return 0;
			}

			@Override
			public boolean isChangeable() {
				return false;
			}

			@Override
			public boolean isDerived() {
				return false;
			}

			@Override
			public boolean isTransient() {
				return false;
			}

			@Override
			public boolean isUnsettable() {
				return false;
			}

			@Override
			public boolean isVolatile() {
				return false;
			}

			@Override
			public void setChangeable(boolean value) {
				
			}

			@Override
			public void setDefaultValue(Object value) {
				
			}

			@Override
			public void setDefaultValueLiteral(String value) {
				
			}

			@Override
			public void setDerived(boolean value) {
				
			}

			@Override
			public void setTransient(boolean value) {
				
			}

			@Override
			public void setUnsettable(boolean value) {
				
			}

			@Override
			public void setVolatile(boolean value) {
				
			}

			@Override
			public EGenericType getEGenericType() {
				return null;
			}

			@Override
			public EClassifier getEType() {
				return null;
			}

			@Override
			public int getLowerBound() {
				return 0;
			}

			@Override
			public int getUpperBound() {
				return 0;
			}

			@Override
			public boolean isMany() {
				return false;
			}

			@Override
			public boolean isOrdered() {
				return false;
			}

			@Override
			public boolean isRequired() {
				return false;
			}

			@Override
			public boolean isUnique() {
				return false;
			}

			@Override
			public void setEGenericType(EGenericType value) {
				
			}

			@Override
			public void setEType(EClassifier value) {
				
			}

			@Override
			public void setLowerBound(int value) {
				
			}

			@Override
			public void setOrdered(boolean value) {
				
			}

			@Override
			public void setUnique(boolean value) {
				
			}

			@Override
			public void setUpperBound(int value) {
				
			}

			@Override
			public void setName(String value) {
				
			}

			@Override
			public EAnnotation getEAnnotation(String source) {
				return null;
			}

			@Override
			public EList<EAnnotation> getEAnnotations() {
				return null;
			}

			@Override
			public TreeIterator<EObject> eAllContents() {
				return null;
			}

			@Override
			public EClass eClass() {
				return null;
			}

			@Override
			public EObject eContainer() {
				return null;
			}

			@Override
			public EStructuralFeature eContainingFeature() {
				return null;
			}

			@Override
			public EReference eContainmentFeature() {
				return null;
			}

			@Override
			public EList<EObject> eContents() {
				return null;
			}

			@Override
			public EList<EObject> eCrossReferences() {
				return null;
			}

			@Override
			public Object eGet(EStructuralFeature feature) {
				return null;
			}

			@Override
			public Object eGet(EStructuralFeature feature, boolean resolve) {
				return null;
			}

			@Override
			public boolean eIsProxy() {
				return false;
			}

			@Override
			public boolean eIsSet(EStructuralFeature feature) {
				return false;
			}

			@Override
			public Resource eResource() {
				return null;
			}

			@Override
			public void eSet(EStructuralFeature feature, Object newValue) {
				
			}

			@Override
			public void eUnset(EStructuralFeature feature) {
				
			}

			@Override
			public EList<Adapter> eAdapters() {
				return null;
			}

			@Override
			public boolean eDeliver() {
				return false;
			}

			@Override
			public void eNotify(Notification notification) {
				
			}

			@Override
			public void eSetDeliver(boolean deliver) {
				
			}

			@Override
			public Object eInvoke(EOperation operation, EList<?> arguments)
					throws InvocationTargetException {
				return null;
			}
			
		});
	}

	@Override
	public boolean isDSLTransType() {
		return true;
	}
	
}
