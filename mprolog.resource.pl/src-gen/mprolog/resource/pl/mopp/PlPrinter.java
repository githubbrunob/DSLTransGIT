/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlPrinter implements mprolog.resource.pl.IPlTextPrinter {
	
	protected mprolog.resource.pl.IPlTokenResolverFactory tokenResolverFactory = new mprolog.resource.pl.mopp.PlTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private mprolog.resource.pl.IPlTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public PlPrinter(java.io.OutputStream outputStream, mprolog.resource.pl.IPlTextResource resource) {
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
		
		if (element instanceof mprolog.Model) {
			print_mprolog_Model((mprolog.Model) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Clause) {
			print_mprolog_Clause((mprolog.Clause) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Head) {
			print_mprolog_Head((mprolog.Head) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Body) {
			print_mprolog_Body((mprolog.Body) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Variable) {
			print_mprolog_Variable((mprolog.Variable) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Parenthesis) {
			print_mprolog_Parenthesis((mprolog.Parenthesis) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Functor) {
			print_mprolog_Functor((mprolog.Functor) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.QuotedAtom) {
			print_mprolog_QuotedAtom((mprolog.QuotedAtom) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.List) {
			print_mprolog_List((mprolog.List) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.InfixExpression) {
			print_mprolog_InfixExpression((mprolog.InfixExpression) element, globaltab, out);
			return;
		}
		if (element instanceof mprolog.Operator) {
			print_mprolog_Operator((mprolog.Operator) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected mprolog.resource.pl.mopp.PlReferenceResolverSwitch getReferenceResolverSwitch() {
		return (mprolog.resource.pl.mopp.PlReferenceResolverSwitch) new mprolog.resource.pl.mopp.PlMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		mprolog.resource.pl.IPlTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new mprolog.resource.pl.mopp.PlProblem(errorMessage, mprolog.resource.pl.PlEProblemType.PRINT_PROBLEM, mprolog.resource.pl.PlEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public mprolog.resource.pl.IPlTextResource getResource() {
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
	
	public void print_mprolog_Model(mprolog.Model element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.MODEL__OWNED_CLAUSE));
		printCountingMap.put("ownedClause", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedClause");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.MODEL__OWNED_CLAUSE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedClause", 0);
		}
	}
	
	
	public void print_mprolog_Clause(mprolog.Clause element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_HEAD));
		printCountingMap.put("ownedHead", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_BODY));
		printCountingMap.put("ownedBody", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_Clause_0(element, localtab, out1, printCountingMap1);
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
		print_mprolog_Clause_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_mprolog_Clause_0(mprolog.Clause element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedHead");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_HEAD));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedHead", count - 1);
		}
	}
	
	public void print_mprolog_Clause_1(mprolog.Clause element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedBody");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedBody", count - 1);
		}
	}
	
	
	public void print_mprolog_Head(mprolog.Head element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.HEAD__OWNED_FUNCTOR));
		printCountingMap.put("ownedFunctor", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedFunctor");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.HEAD__OWNED_FUNCTOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedFunctor", count - 1);
		}
	}
	
	
	public void print_mprolog_Body(mprolog.Body element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.BODY__OWNED_TERM));
		printCountingMap.put("ownedTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.BODY__OWNED_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_Variable(mprolog.Variable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NEXT_TERM));
		printCountingMap.put("nextTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NAME));
			if (o != null) {
				mprolog.resource.pl.IPlTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_Variable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_Variable_0(mprolog.Variable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nextTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NEXT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nextTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_Parenthesis(mprolog.Parenthesis element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__NEXT_TERM));
		printCountingMap.put("nextTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__OWNED_TERM));
		printCountingMap.put("ownedTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__OWNED_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_Parenthesis_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_Parenthesis_0(mprolog.Parenthesis element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nextTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__NEXT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nextTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_Functor(mprolog.Functor element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__NEXT_TERM));
		printCountingMap.put("nextTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__OWNED_TERM));
		printCountingMap.put("ownedTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_mprolog_Functor_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_Functor_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_Functor_0(mprolog.Functor element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"text"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"text"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				java.io.StringWriter sWriter = null;
				java.io.PrintWriter out1 = null;
				java.util.Map<String, Integer> printCountingMap1 = null;
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("text");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT));
					if (o != null) {
						mprolog.resource.pl.IPlTokenResolver resolver = tokenResolverFactory.createTokenResolver("ATOM");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), element));
						out.print(" ");
					}
					printCountingMap.put("text", count - 1);
				}
				// DEFINITION PART BEGINS (CompoundDefinition)
				sWriter = new java.io.StringWriter();
				out1 = new java.io.PrintWriter(sWriter);
				printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
				print_mprolog_Functor_0_0(element, localtab, out1, printCountingMap1);
				if (printCountingMap.equals(printCountingMap1)) {
					out1.close();
				} else {
					out1.flush();
					out1.close();
					out.print(sWriter.toString());
					printCountingMap.putAll(printCountingMap1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("text");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT));
				if (o != null) {
					mprolog.resource.pl.IPlTokenResolver resolver = tokenResolverFactory.createTokenResolver("NUMBER");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), element));
					out.print(" ");
				}
				printCountingMap.put("text", count - 1);
			}
		}
	}
	
	public void print_mprolog_Functor_0_0(mprolog.Functor element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__OWNED_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_mprolog_Functor_1(mprolog.Functor element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nextTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__NEXT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nextTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_QuotedAtom(mprolog.QuotedAtom element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__NEXT_TERM));
		printCountingMap.put("nextTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__TEXT));
			if (o != null) {
				mprolog.resource.pl.IPlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__TEXT), element));
				out.print(" ");
			}
			printCountingMap.put("text", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_QuotedAtom_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_QuotedAtom_0(mprolog.QuotedAtom element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nextTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__NEXT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nextTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_List(mprolog.List element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__NEXT_TERM));
		printCountingMap.put("nextTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_HEAD_TERMS));
		printCountingMap.put("ownedHeadTerms", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_TAIL_TERMS));
		printCountingMap.put("ownedTailTerms", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_List_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_List_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_List_0(mprolog.List element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedHeadTerms");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_HEAD_TERMS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedHeadTerms", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_List_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_List_0_0(mprolog.List element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTailTerms");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_TAIL_TERMS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTailTerms", count - 1);
		}
	}
	
	public void print_mprolog_List_1(mprolog.List element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nextTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__NEXT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nextTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_InfixExpression(mprolog.InfixExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__NEXT_TERM));
		printCountingMap.put("nextTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__LEFT_TERM));
		printCountingMap.put("leftTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__RIGHT_TERM));
		printCountingMap.put("rightTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__OWNED_OPERATOR));
		printCountingMap.put("ownedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__LEFT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftTerm", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__OWNED_OPERATOR));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedOperator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__RIGHT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_mprolog_InfixExpression_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_mprolog_InfixExpression_0(mprolog.InfixExpression element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nextTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__NEXT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nextTerm", count - 1);
		}
	}
	
	
	public void print_mprolog_Operator(mprolog.Operator element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.OPERATOR__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.OPERATOR__SYMBOL));
			if (o != null) {
				mprolog.resource.pl.IPlTokenResolver resolver = tokenResolverFactory.createTokenResolver("OPERATOR");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(mprolog.MprologPackage.OPERATOR__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	
}
