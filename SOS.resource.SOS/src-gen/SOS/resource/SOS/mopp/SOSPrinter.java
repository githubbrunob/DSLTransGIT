/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSPrinter implements SOS.resource.SOS.ISOSTextPrinter {
	
	protected SOS.resource.SOS.ISOSTokenResolverFactory tokenResolverFactory = new SOS.resource.SOS.mopp.SOSTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private SOS.resource.SOS.ISOSTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public SOSPrinter(java.io.OutputStream outputStream, SOS.resource.SOS.ISOSTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof SOS.Semantics) {
			print_SOS_Semantics((SOS.Semantics) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.Rule) {
			print_SOS_Rule((SOS.Rule) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.PremisseList) {
			print_SOS_PremisseList((SOS.PremisseList) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.AlgebraicConditionList) {
			print_SOS_AlgebraicConditionList((SOS.AlgebraicConditionList) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.Conclusion) {
			print_SOS_Conclusion((SOS.Conclusion) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.Transition) {
			print_SOS_Transition((SOS.Transition) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.TypeJudment) {
			print_SOS_TypeJudment((SOS.TypeJudment) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.AlgebraicCondition) {
			print_SOS_AlgebraicCondition((SOS.AlgebraicCondition) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.ADT) {
			print_SOS_adtmm_ADT((SOS.adtmm.ADT) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.Operation) {
			print_SOS_adtmm_Operation((SOS.adtmm.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.Variable) {
			print_SOS_adtmm_Variable((SOS.adtmm.Variable) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.CondEquation) {
			print_SOS_adtmm_CondEquation((SOS.adtmm.CondEquation) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.VariableRef) {
			print_SOS_adtmm_VariableRef((SOS.adtmm.VariableRef) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.CTerm) {
			print_SOS_adtmm_CTerm((SOS.adtmm.CTerm) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.Equation) {
			print_SOS_adtmm_Equation((SOS.adtmm.Equation) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.Inequation) {
			print_SOS_adtmm_Inequation((SOS.adtmm.Inequation) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.AtomicSort) {
			print_SOS_adtmm_AtomicSort((SOS.adtmm.AtomicSort) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.adtmm.SortDeclaration) {
			print_SOS_adtmm_SortDeclaration((SOS.adtmm.SortDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.Set) {
			print_SOS_set_Set((SOS.set.Set) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.ModelSet) {
			print_SOS_set_ModelSet((SOS.set.ModelSet) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.SetConstructor) {
			print_SOS_set_SetConstructor((SOS.set.SetConstructor) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.ForAllIn) {
			print_SOS_set_ForAllIn((SOS.set.ForAllIn) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.ExistsIn) {
			print_SOS_set_ExistsIn((SOS.set.ExistsIn) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.Union) {
			print_SOS_set_Union((SOS.set.Union) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.Excluding) {
			print_SOS_set_Excluding((SOS.set.Excluding) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.Intersection) {
			print_SOS_set_Intersection((SOS.set.Intersection) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.ModelRelation) {
			print_SOS_set_ModelRelation((SOS.set.ModelRelation) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.ModelClassAttribute) {
			print_SOS_set_ModelClassAttribute((SOS.set.ModelClassAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof SOS.set.ModelSort) {
			print_SOS_set_ModelSort((SOS.set.ModelSort) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected SOS.resource.SOS.mopp.SOSReferenceResolverSwitch getReferenceResolverSwitch() {
		return (SOS.resource.SOS.mopp.SOSReferenceResolverSwitch) new SOS.resource.SOS.mopp.SOSMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		SOS.resource.SOS.ISOSTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new SOS.resource.SOS.mopp.SOSProblem(errorMessage, SOS.resource.SOS.SOSEProblemType.PRINT_PROBLEM, SOS.resource.SOS.SOSEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public SOS.resource.SOS.ISOSTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_SOS_Semantics(SOS.Semantics element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.SEMANTICS__RULES));
		printCountingMap.put("rules", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.SEMANTICS__SIGNATURE));
		printCountingMap.put("signature", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Semantics");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_SOS_Semantics_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_SOS_Semantics_0(SOS.Semantics element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"rules"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"signature"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("signature");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.SEMANTICS__SIGNATURE));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("signature", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("rules");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.SEMANTICS__RULES));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("rules", count - 1);
			}
		}
	}
	
	
	public void print_SOS_Rule(SOS.Rule element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__ASSUMES));
		printCountingMap.put("assumes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES));
		printCountingMap.put("concludes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__OWNED_VARIABLES));
		printCountingMap.put("ownedVariables", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_SOS_Rule_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_Rule_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_SOS_Rule_0(SOS.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"assumes"		,
		"concludes"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"concludes"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_SOS_Rule_0_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_SOS_Rule_0_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_SOS_Rule_0_0(SOS.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Assuming");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("assumes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__ASSUMES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("assumes", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("Then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("concludes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("concludes", count - 1);
		}
	}
	
	public void print_SOS_Rule_0_1(SOS.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Fact");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("concludes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("concludes", count - 1);
		}
	}
	
	public void print_SOS_Rule_1(SOS.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedVariables");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__OWNED_VARIABLES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedVariables", 0);
		}
	}
	
	
	public void print_SOS_PremisseList(SOS.PremisseList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__HAS));
		printCountingMap.put("has", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("has");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__HAS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("has", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_PremisseList_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_SOS_PremisseList_0(SOS.PremisseList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("next");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__NEXT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("next", count - 1);
		}
	}
	
	
	public void print_SOS_AlgebraicConditionList(SOS.AlgebraicConditionList element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS));
		printCountingMap.put("has", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("has");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("has", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_AlgebraicConditionList_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_SOS_AlgebraicConditionList_0(SOS.AlgebraicConditionList element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("next");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("next", count - 1);
		}
	}
	
	
	public void print_SOS_Conclusion(SOS.Conclusion element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.CONCLUSION__HAS));
		printCountingMap.put("has", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("has");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.CONCLUSION__HAS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("has", count - 1);
		}
	}
	
	
	public void print_SOS_Transition(SOS.Transition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__PRE_STATE));
		printCountingMap.put("preState", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__POS_STATE));
		printCountingMap.put("posState", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__ENVIRONMENT));
		printCountingMap.put("environment", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_Transition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("preState");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__PRE_STATE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("preState", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("->>");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__LABEL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("->>");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("posState");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__POS_STATE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("posState", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("Transition");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("System");
		out.print(" ");
	}
	
	public void print_SOS_Transition_0(SOS.Transition element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("environment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__ENVIRONMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("environment", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
	}
	
	
	public void print_SOS_TypeJudment(SOS.TypeJudment element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__ENVIRONMENT));
		printCountingMap.put("environment", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE));
		printCountingMap.put("leftHandSide", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE));
		printCountingMap.put("rightHandSide", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_TypeJudment_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightHandSide", count - 1);
		}
	}
	
	public void print_SOS_TypeJudment_0(SOS.TypeJudment element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("environment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__ENVIRONMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("environment", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
	}
	
	
	public void print_SOS_AlgebraicCondition(SOS.AlgebraicCondition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS));
		printCountingMap.put("ownedConditions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedConditions"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ownedConditions"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("ownedConditions");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS));
					java.util.List<?> list = (java.util.List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("ownedConditions", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("(");
			out.print(" ");
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("ownedConditions");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS));
				java.util.List<?> list = (java.util.List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("ownedConditions", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print(")");
			out.print(" ");
		}
	}
	
	
	public void print_SOS_adtmm_ADT(SOS.adtmm.ADT element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_SORTS));
		printCountingMap.put("ownedSorts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_OPERATIONS));
		printCountingMap.put("ownedOperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_GENERATORS));
		printCountingMap.put("ownedGenerators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_VARIABLES));
		printCountingMap.put("ownedVariables", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_AXIOMS));
		printCountingMap.put("ownedAxioms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ADT");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_ADT_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_ADT_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_ADT_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_ADT_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_ADT_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_SOS_adtmm_ADT_0(SOS.adtmm.ADT element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Sorts");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedSorts");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_SORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedSorts", 0);
		}
	}
	
	public void print_SOS_adtmm_ADT_1(SOS.adtmm.ADT element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Generators");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedGenerators");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_GENERATORS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedGenerators", 0);
		}
	}
	
	public void print_SOS_adtmm_ADT_2(SOS.adtmm.ADT element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Operations");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedOperations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_OPERATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedOperations", 0);
		}
	}
	
	public void print_SOS_adtmm_ADT_3(SOS.adtmm.ADT element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Axioms");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedAxioms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_AXIOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedAxioms", 0);
		}
	}
	
	public void print_SOS_adtmm_ADT_4(SOS.adtmm.ADT element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedVariables");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_VARIABLES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedVariables", 0);
		}
	}
	
	
	public void print_SOS_adtmm_Operation(SOS.adtmm.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__OPERATION_SORTS));
		printCountingMap.put("operationSorts", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__RESULT));
		printCountingMap.put("result", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operationSorts");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__OPERATION_SORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("operationSorts", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("result");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__RESULT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("result", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_SOS_adtmm_Variable(SOS.adtmm.Variable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__VARIABLE_SORT));
		printCountingMap.put("variableSort", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_Variable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_SOS_adtmm_Variable_0(SOS.adtmm.Variable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variableSort");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__VARIABLE_SORT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("variableSort", count - 1);
		}
	}
	
	
	public void print_SOS_adtmm_CondEquation(SOS.adtmm.CondEquation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS));
		printCountingMap.put("ownedConditions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_EQUATION));
		printCountingMap.put("ownedEquation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_CondEquation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedEquation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_EQUATION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedEquation", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_SOS_adtmm_CondEquation_0(SOS.adtmm.CondEquation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedConditions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedConditions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=>");
		out.print(" ");
	}
	
	
	public void print_SOS_adtmm_VariableRef(SOS.adtmm.VariableRef element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("@");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableRefVariableReferenceResolver().deResolve((SOS.adtmm.Variable) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE)), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("variable", count - 1);
		}
	}
	
	
	public void print_SOS_adtmm_CTerm(SOS.adtmm.CTerm element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER));
		printCountingMap.put("iter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OWNED_TERMS));
		printCountingMap.put("ownedTerms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP));
		printCountingMap.put("op", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER_TERM));
		printCountingMap.put("iterTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("op");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCTermOpReferenceResolver().deResolve((SOS.adtmm.Operation) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP)), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP), element));
				out.print(" ");
			}
			printCountingMap.put("op", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_CTerm_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_adtmm_CTerm_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_SOS_adtmm_CTerm_0(SOS.adtmm.CTerm element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("^");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_SOS_adtmm_CTerm_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_SOS_adtmm_CTerm_0_0(SOS.adtmm.CTerm element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"iter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"iterTerm"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("iterTerm");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER_TERM));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("iterTerm", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("iter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER));
				if (o != null) {
					SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER), element));
					out.print(" ");
				}
				printCountingMap.put("iter", count - 1);
			}
		}
	}
	
	public void print_SOS_adtmm_CTerm_1(SOS.adtmm.CTerm element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTerms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OWNED_TERMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTerms", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_adtmm_Equation(SOS.adtmm.Equation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_RIGHT_TERM));
		printCountingMap.put("ownedRightTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_LEFT_TERM));
		printCountingMap.put("ownedLeftTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedLeftTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_LEFT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedLeftTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedRightTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_RIGHT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedRightTerm", count - 1);
		}
	}
	
	
	public void print_SOS_adtmm_Inequation(SOS.adtmm.Inequation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_RIGHT_TERM));
		printCountingMap.put("ownedRightTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_LEFT_TERM));
		printCountingMap.put("ownedLeftTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedLeftTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_LEFT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedLeftTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedRightTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_RIGHT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedRightTerm", count - 1);
		}
	}
	
	
	public void print_SOS_adtmm_AtomicSort(SOS.adtmm.AtomicSort element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION));
		printCountingMap.put("declaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("declaration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAtomicSortDeclarationReferenceResolver().deResolve((SOS.adtmm.SortDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION)), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION), element));
				out.print(" ");
			}
			printCountingMap.put("declaration", count - 1);
		}
	}
	
	
	public void print_SOS_adtmm_SortDeclaration(SOS.adtmm.SortDeclaration element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.SORT_DECLARATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.SORT_DECLARATION__NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.SORT_DECLARATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_SOS_set_Set(SOS.set.Set element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET__SORT));
		printCountingMap.put("sort", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Set");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sort");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET__SORT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sort", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_set_ModelSet(SOS.set.ModelSet element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("Model");
		out.print(" ");
	}
	
	
	public void print_SOS_set_SetConstructor(SOS.set.SetConstructor element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__SUCH_THAT));
		printCountingMap.put("suchThat", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__MEMBER));
		printCountingMap.put("member", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_set_SetConstructor_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_SOS_set_SetConstructor_0(SOS.set.SetConstructor element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("member");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__MEMBER));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("member", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_SOS_set_SetConstructor_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_SOS_set_SetConstructor_0_0(SOS.set.SetConstructor element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("suchThat");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__SUCH_THAT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("suchThat", count - 1);
		}
	}
	
	
	public void print_SOS_set_ForAllIn(SOS.set.ForAllIn element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__LEFT_HAND_SIDE));
		printCountingMap.put("leftHandSide", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__RIGHT_HAND_SIDE));
		printCountingMap.put("rightHandSide", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__LEFT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__RIGHT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_set_ExistsIn(SOS.set.ExistsIn element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__LEFT_HAND_SIDE));
		printCountingMap.put("leftHandSide", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__RIGHT_HAND_SIDE));
		printCountingMap.put("rightHandSide", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("existsIn");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__LEFT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__RIGHT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_set_Union(SOS.set.Union element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.UNION__LEFT_HAND_SIDE));
		printCountingMap.put("leftHandSide", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.UNION__RIGHT_HAND_SIDE));
		printCountingMap.put("rightHandSide", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Union");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.UNION__LEFT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.UNION__RIGHT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_set_Excluding(SOS.set.Excluding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__LEFT_HAND_SIDE));
		printCountingMap.put("leftHandSide", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__RIGHT_HAND_SIDE));
		printCountingMap.put("rightHandSide", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Excluding");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__LEFT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__RIGHT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_set_Intersection(SOS.set.Intersection element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__LEFT_HAND_SIDE));
		printCountingMap.put("leftHandSide", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__RIGHT_HAND_SIDE));
		printCountingMap.put("rightHandSide", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Intersect");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__LEFT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightHandSide");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__RIGHT_HAND_SIDE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightHandSide", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_SOS_set_ModelRelation(SOS.set.ModelRelation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__REFERENCE_NAME));
		printCountingMap.put("referenceName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referenceName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__REFERENCE_NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__REFERENCE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("referenceName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_SOS_set_ModelClassAttribute(SOS.set.ModelClassAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__SELECTOR));
		printCountingMap.put("selector", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME));
		printCountingMap.put("attributeName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("selector");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__SELECTOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("selector", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("attributeName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("attributeName", count - 1);
		}
	}
	
	
	public void print_SOS_set_ModelSort(SOS.set.ModelSort element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__CLASS_NAME));
		printCountingMap.put("className", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__PACKAGE_NAME));
		printCountingMap.put("packageName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("class");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("packageName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__PACKAGE_NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__PACKAGE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("packageName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("className");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__CLASS_NAME));
			if (o != null) {
				SOS.resource.SOS.ISOSTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__CLASS_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("className", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
}
