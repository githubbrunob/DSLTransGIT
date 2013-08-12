/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextPrinter implements dsltrans.resource.dsltranstext.IDsltranstextTextPrinter {
	
	protected dsltrans.resource.dsltranstext.IDsltranstextTokenResolverFactory tokenResolverFactory = new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private dsltrans.resource.dsltranstext.IDsltranstextTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public DsltranstextPrinter(java.io.OutputStream outputStream, dsltrans.resource.dsltranstext.IDsltranstextTextResource resource) {
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
		
		if (element instanceof dsltrans.TransformationModel) {
			print_dsltrans_TransformationModel((dsltrans.TransformationModel) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.FilePort) {
			print_dsltrans_FilePort((dsltrans.FilePort) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.MetaModelIdentifier) {
			print_dsltrans_MetaModelIdentifier((dsltrans.MetaModelIdentifier) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Sequential) {
			print_dsltrans_Sequential((dsltrans.Sequential) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Rule) {
			print_dsltrans_Rule((dsltrans.Rule) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.MatchModel) {
			print_dsltrans_MatchModel((dsltrans.MatchModel) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ApplyModel) {
			print_dsltrans_ApplyModel((dsltrans.ApplyModel) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.AnyMatchClass) {
			print_dsltrans_AnyMatchClass((dsltrans.AnyMatchClass) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ExistsMatchClass) {
			print_dsltrans_ExistsMatchClass((dsltrans.ExistsMatchClass) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.NegativeMatchClass) {
			print_dsltrans_NegativeMatchClass((dsltrans.NegativeMatchClass) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ApplyClass) {
			print_dsltrans_ApplyClass((dsltrans.ApplyClass) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.PositiveMatchAssociation) {
			print_dsltrans_PositiveMatchAssociation((dsltrans.PositiveMatchAssociation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.NegativeMatchAssociation) {
			print_dsltrans_NegativeMatchAssociation((dsltrans.NegativeMatchAssociation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.PositiveIndirectAssociation) {
			print_dsltrans_PositiveIndirectAssociation((dsltrans.PositiveIndirectAssociation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.NegativeIndirectAssociation) {
			print_dsltrans_NegativeIndirectAssociation((dsltrans.NegativeIndirectAssociation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.MatchAttribute) {
			print_dsltrans_MatchAttribute((dsltrans.MatchAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ApplyAttribute) {
			print_dsltrans_ApplyAttribute((dsltrans.ApplyAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.PositiveBackwardRestriction) {
			print_dsltrans_PositiveBackwardRestriction((dsltrans.PositiveBackwardRestriction) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.NegativeBackwardRestriction) {
			print_dsltrans_NegativeBackwardRestriction((dsltrans.NegativeBackwardRestriction) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Import) {
			print_dsltrans_Import((dsltrans.Import) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Atom) {
			print_dsltrans_Atom((dsltrans.Atom) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ClassRef) {
			print_dsltrans_ClassRef((dsltrans.ClassRef) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Concat) {
			print_dsltrans_Concat((dsltrans.Concat) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.TypeOf) {
			print_dsltrans_TypeOf((dsltrans.TypeOf) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Wildcard) {
			print_dsltrans_Wildcard((dsltrans.Wildcard) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.isNull) {
			print_dsltrans_isNull((dsltrans.isNull) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.Sequencer) {
			print_dsltrans_Sequencer((dsltrans.Sequencer) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.AttributeEquality) {
			print_dsltrans_AttributeEquality((dsltrans.AttributeEquality) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.AttributeInequality) {
			print_dsltrans_AttributeInequality((dsltrans.AttributeInequality) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.MatchMayBeSameRelation) {
			print_dsltrans_MatchMayBeSameRelation((dsltrans.MatchMayBeSameRelation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ApplyMayBeSameRelation) {
			print_dsltrans_ApplyMayBeSameRelation((dsltrans.ApplyMayBeSameRelation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.ApplyAssociation) {
			print_dsltrans_ApplyAssociation((dsltrans.ApplyAssociation) element, globaltab, out);
			return;
		}
		if (element instanceof dsltrans.AttributeRef) {
			print_dsltrans_AttributeRef((dsltrans.AttributeRef) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected dsltrans.resource.dsltranstext.mopp.DsltranstextReferenceResolverSwitch getReferenceResolverSwitch() {
		return (dsltrans.resource.dsltranstext.mopp.DsltranstextReferenceResolverSwitch) new dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		dsltrans.resource.dsltranstext.IDsltranstextTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new dsltrans.resource.dsltranstext.mopp.DsltranstextProblem(errorMessage, dsltrans.resource.dsltranstext.DsltranstextEProblemType.PRINT_PROBLEM, dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextResource getResource() {
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
	
	public void print_dsltrans_TransformationModel(dsltrans.TransformationModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TRANSFORMATION_MODEL__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TRANSFORMATION_MODEL__SOURCE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", 0);
		}
	}
	
	
	public void print_dsltrans_FilePort(dsltrans.FilePort element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__META_MODEL_ID));
		printCountingMap.put("metaModelId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__FILE_PATH_URI));
		printCountingMap.put("filePathURI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("File");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_FilePort_0(element, localtab, out1, printCountingMap1);
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
		print_dsltrans_FilePort_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metaModelId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__META_MODEL_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metaModelId", count - 1);
		}
	}
	
	public void print_dsltrans_FilePort_0(dsltrans.FilePort element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("id");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_FilePort_1(dsltrans.FilePort element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("uri");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("filePathURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__FILE_PATH_URI));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__FILE_PATH_URI), element));
				out.print(" ");
			}
			printCountingMap.put("filePathURI", count - 1);
		}
	}
	
	
	public void print_dsltrans_MetaModelIdentifier(dsltrans.MetaModelIdentifier element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI));
		printCountingMap.put("metaModelURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME));
		printCountingMap.put("metaModelName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_MetaModelIdentifier_0(element, localtab, out1, printCountingMap1);
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
		print_dsltrans_MetaModelIdentifier_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_MetaModelIdentifier_0(dsltrans.MetaModelIdentifier element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("mmname");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("metaModelName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("metaModelName", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_MetaModelIdentifier_1(dsltrans.MetaModelIdentifier element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("uri");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("metaModelURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI), element));
				out.print(" ");
			}
			printCountingMap.put("metaModelURI", count - 1);
		}
	}
	
	
	public void print_dsltrans_Sequential(dsltrans.Sequential element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__META_MODEL_ID));
		printCountingMap.put("metaModelId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE));
		printCountingMap.put("previousSource", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__OUTPUT_FILE_PATH_URI));
		printCountingMap.put("outputFilePathURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__HAS_RULE));
		printCountingMap.put("hasRule", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__GROUP_NAME));
		printCountingMap.put("groupName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("def");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Sequential_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("layer");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print("  ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Sequential_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("previous");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("previousSource");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLayerPreviousSourceReferenceResolver().deResolve((dsltrans.AbstractSource) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("previousSource", 0);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Sequential_2(element, localtab, out1, printCountingMap1);
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
		print_dsltrans_Sequential_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metaModelId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__META_MODEL_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metaModelId", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_Sequential_4(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("end");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("def");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_Sequential_0(dsltrans.Sequential element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__DESCRIPTION));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__DESCRIPTION), element));
			}
			printCountingMap.put("description", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_dsltrans_Sequential_1(dsltrans.Sequential element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_dsltrans_Sequential_2(dsltrans.Sequential element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("group");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("groupName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__GROUP_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__GROUP_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("groupName", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_Sequential_3(dsltrans.Sequential element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("output");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("outputFilePathURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__OUTPUT_FILE_PATH_URI));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__OUTPUT_FILE_PATH_URI), element));
				out.print(" ");
			}
			printCountingMap.put("outputFilePathURI", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_Sequential_4(dsltrans.Sequential element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("hasRule");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__HAS_RULE));
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
			printCountingMap.put("hasRule", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
	}
	
	
	public void print_dsltrans_Rule(dsltrans.Rule element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__MATCH));
		printCountingMap.put("match", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__APPLY));
		printCountingMap.put("apply", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__BACKWARDS));
		printCountingMap.put("backwards", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__ATTRIBUTE_RELATIONS));
		printCountingMap.put("attributeRelations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("rule");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Rule_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_dsltrans_Rule_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_Rule_1(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_dsltrans_Rule_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Rule_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Rule_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_Rule_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("end");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("rule");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_Rule_0(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__DESCRIPTION));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	public void print_dsltrans_Rule_1(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("match");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("match");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__MATCH));
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
			printCountingMap.put("match", count - 1);
		}
	}
	
	public void print_dsltrans_Rule_2(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("apply");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("apply");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__APPLY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("apply", count - 1);
		}
	}
	
	public void print_dsltrans_Rule_3(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("where");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_Rule_3_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_dsltrans_Rule_3_0(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributeRelations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__ATTRIBUTE_RELATIONS));
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
			printCountingMap.put("attributeRelations", count - 1);
		}
	}
	
	public void print_dsltrans_Rule_4(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("restrictions");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_Rule_4_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_dsltrans_Rule_4_0(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("backwards");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__BACKWARDS));
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
			printCountingMap.put("backwards", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_Rule_5(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("import");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_Rule_5_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_dsltrans_Rule_5_0(dsltrans.Rule element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__IMPORTS));
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
			printCountingMap.put("imports", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
	}
	
	
	public void print_dsltrans_MatchModel(dsltrans.MatchModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__CLASS));
		printCountingMap.put("class", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__ASSOCIATION));
		printCountingMap.put("association", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE));
		printCountingMap.put("explicitSource", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_MatchModel_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("with");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_MatchModel_1(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_MatchModel_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_MatchModel_0(dsltrans.MatchModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("explicitSource");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchModelExplicitSourceReferenceResolver().deResolve((dsltrans.FilePort) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE), element));
			}
			printCountingMap.put("explicitSource", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_dsltrans_MatchModel_1(dsltrans.MatchModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("class");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__CLASS));
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
			printCountingMap.put("class", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_MatchModel_2(dsltrans.MatchModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("subject");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_MatchModel_2_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_dsltrans_MatchModel_2_0(dsltrans.MatchModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "			";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("association");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__ASSOCIATION));
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
			printCountingMap.put("association", count - 1);
		}
	}
	
	
	public void print_dsltrans_ApplyModel(dsltrans.ApplyModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MODEL__CLASS));
		printCountingMap.put("class", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MODEL__ASSOCIATION));
		printCountingMap.put("association", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_ApplyModel_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyModel_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_ApplyModel_0(dsltrans.ApplyModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("class");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MODEL__CLASS));
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
			printCountingMap.put("class", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
	}
	
	public void print_dsltrans_ApplyModel_1(dsltrans.ApplyModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("subject");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_ApplyModel_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_dsltrans_ApplyModel_1_0(dsltrans.ApplyModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "			";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("association");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MODEL__ASSOCIATION));
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
			printCountingMap.put("association", count - 1);
		}
	}
	
	
	public void print_dsltrans_AnyMatchClass(dsltrans.AnyMatchClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__PACKAGE_NAME));
		printCountingMap.put("packageName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__CLASS_NAME));
		printCountingMap.put("className", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE));
		printCountingMap.put("allowInheritance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_AnyMatchClass_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_AnyMatchClass_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("any");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_AnyMatchClass_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("packageName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__PACKAGE_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__PACKAGE_NAME), element));
			}
			printCountingMap.put("packageName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("className");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__CLASS_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__CLASS_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("className", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_AnyMatchClass_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_AnyMatchClass_0(dsltrans.AnyMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__DESCRIPTION));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("DESCCOM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	public void print_dsltrans_AnyMatchClass_1(dsltrans.AnyMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ID));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
	}
	
	public void print_dsltrans_AnyMatchClass_2(dsltrans.AnyMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("allowInheritance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE));
			if (o != null) {
			}
			printCountingMap.put("allowInheritance", count - 1);
		}
	}
	
	public void print_dsltrans_AnyMatchClass_3(dsltrans.AnyMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_AnyMatchClass_3_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_dsltrans_AnyMatchClass_3_0(dsltrans.AnyMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print("  ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ATTRIBUTE));
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
			printCountingMap.put("attribute", count - 1);
		}
	}
	
	
	public void print_dsltrans_ExistsMatchClass(dsltrans.ExistsMatchClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__PACKAGE_NAME));
		printCountingMap.put("packageName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__CLASS_NAME));
		printCountingMap.put("className", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE));
		printCountingMap.put("allowInheritance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ExistsMatchClass_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ExistsMatchClass_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("existing");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ExistsMatchClass_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("packageName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__PACKAGE_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__PACKAGE_NAME), element));
			}
			printCountingMap.put("packageName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("className");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__CLASS_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__CLASS_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("className", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ExistsMatchClass_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_ExistsMatchClass_0(dsltrans.ExistsMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__DESCRIPTION));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("DESCCOM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	public void print_dsltrans_ExistsMatchClass_1(dsltrans.ExistsMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ID));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
	}
	
	public void print_dsltrans_ExistsMatchClass_2(dsltrans.ExistsMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("allowInheritance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE));
			if (o != null) {
			}
			printCountingMap.put("allowInheritance", count - 1);
		}
	}
	
	public void print_dsltrans_ExistsMatchClass_3(dsltrans.ExistsMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_dsltrans_ExistsMatchClass_3_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_dsltrans_ExistsMatchClass_3_0(dsltrans.ExistsMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print("  ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ATTRIBUTE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attribute", 0);
		}
	}
	
	
	public void print_dsltrans_NegativeMatchClass(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__PACKAGE_NAME));
		printCountingMap.put("packageName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__CLASS_NAME));
		printCountingMap.put("className", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE));
		printCountingMap.put("allowInheritance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_NegativeMatchClass_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_NegativeMatchClass_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("not");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_NegativeMatchClass_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("packageName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__PACKAGE_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__PACKAGE_NAME), element));
			}
			printCountingMap.put("packageName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("className");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__CLASS_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__CLASS_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("className", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_NegativeMatchClass_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_NegativeMatchClass_0(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__DESCRIPTION));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("DESCCOM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	public void print_dsltrans_NegativeMatchClass_1(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ID));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
	}
	
	public void print_dsltrans_NegativeMatchClass_2(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("allowInheritance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE));
			if (o != null) {
			}
			printCountingMap.put("allowInheritance", count - 1);
		}
	}
	
	public void print_dsltrans_NegativeMatchClass_3(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_dsltrans_NegativeMatchClass_3_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_dsltrans_NegativeMatchClass_3_0(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_NegativeMatchClass_3_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_dsltrans_NegativeMatchClass_3_0_0(dsltrans.NegativeMatchClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print("  ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ATTRIBUTE));
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
			printCountingMap.put("attribute", count - 1);
		}
	}
	
	
	public void print_dsltrans_ApplyClass(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__PACKAGE_NAME));
		printCountingMap.put("packageName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__CLASS_NAME));
		printCountingMap.put("className", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE));
		printCountingMap.put("allowInheritance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__GROUP_NAME));
		printCountingMap.put("groupName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyClass_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyClass_1(element, localtab, out1, printCountingMap1);
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
		print_dsltrans_ApplyClass_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("packageName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__PACKAGE_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__PACKAGE_NAME), element));
			}
			printCountingMap.put("packageName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("className");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__CLASS_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__CLASS_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("className", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyClass_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyClass_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_ApplyClass_0(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__DESCRIPTION));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("DESCCOM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
	}
	
	public void print_dsltrans_ApplyClass_1(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ID));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
	}
	
	public void print_dsltrans_ApplyClass_2(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("allowInheritance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE));
			if (o != null) {
			}
			printCountingMap.put("allowInheritance", count - 1);
		}
	}
	
	public void print_dsltrans_ApplyClass_3(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_dsltrans_ApplyClass_3_0(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_dsltrans_ApplyClass_3_0(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "			";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ATTRIBUTE));
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
			printCountingMap.put("attribute", count - 1);
		}
	}
	
	public void print_dsltrans_ApplyClass_4(dsltrans.ApplyClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("group");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("groupName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__GROUP_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__GROUP_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("groupName", count - 1);
		}
	}
	
	
	public void print_dsltrans_PositiveMatchAssociation(dsltrans.PositiveMatchAssociation element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE), element));
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("--");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("associationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME), element));
			}
			printCountingMap.put("associationName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_dsltrans_NegativeMatchAssociation(dsltrans.NegativeMatchAssociation element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE), element));
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("!-");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("associationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME), element));
			}
			printCountingMap.put("associationName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_dsltrans_PositiveIndirectAssociation(dsltrans.PositiveIndirectAssociation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE), element));
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("~~");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_PositiveIndirectAssociation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("~>");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	public void print_dsltrans_PositiveIndirectAssociation_0(dsltrans.PositiveIndirectAssociation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("associationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME), element));
			}
			printCountingMap.put("associationName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_dsltrans_NegativeIndirectAssociation(dsltrans.NegativeIndirectAssociation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE), element));
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("!~");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_NegativeIndirectAssociation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("~>");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	public void print_dsltrans_NegativeIndirectAssociation_0(dsltrans.NegativeIndirectAssociation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("associationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME), element));
			}
			printCountingMap.put("associationName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_dsltrans_ApplyAssociation(dsltrans.ApplyAssociation element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationSourceReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("--");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("associationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__ASSOCIATION_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__ASSOCIATION_NAME), element));
			}
			printCountingMap.put("associationName", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationTargetReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_dsltrans_MatchAttribute(dsltrans.MatchAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_NAME));
		printCountingMap.put("attributeName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE));
		printCountingMap.put("attributeValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_MatchAttribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("attributeName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("attributeName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_MatchAttribute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_MatchAttribute_0(dsltrans.MatchAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ID));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_dsltrans_MatchAttribute_1(dsltrans.MatchAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributeValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributeValue", count - 1);
		}
	}
	
	
	public void print_dsltrans_ApplyAttribute(dsltrans.ApplyAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_NAME));
		printCountingMap.put("attributeName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_VALUE));
		printCountingMap.put("attributeValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attributeName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attributeValue"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_dsltrans_ApplyAttribute_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_dsltrans_ApplyAttribute_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_dsltrans_ApplyAttribute_0(dsltrans.ApplyAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyAttribute_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_dsltrans_ApplyAttribute_0_1(element, localtab, out, printCountingMap);
	}
	
	public void print_dsltrans_ApplyAttribute_0_0(dsltrans.ApplyAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ID));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ID), element));
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_dsltrans_ApplyAttribute_0_1(dsltrans.ApplyAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("attributeName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_NAME));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("attributeName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_dsltrans_ApplyAttribute_0_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_dsltrans_ApplyAttribute_0_1_0(dsltrans.ApplyAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributeValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributeValue", count - 1);
		}
	}
	
	public void print_dsltrans_ApplyAttribute_1(dsltrans.ApplyAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("self");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributeValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributeValue", count - 1);
		}
	}
	
	
	public void print_dsltrans_PositiveBackwardRestriction(dsltrans.PositiveBackwardRestriction element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS));
		printCountingMap.put("targetClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS));
		printCountingMap.put("sourceClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationTargetClassReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS), element));
			}
			printCountingMap.put("targetClass", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("derived");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("from");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("sourceClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationSourceClassReferenceResolver().deResolve((dsltrans.PositiveMatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("sourceClass", count - 1);
		}
	}
	
	
	public void print_dsltrans_NegativeBackwardRestriction(dsltrans.NegativeBackwardRestriction element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS));
		printCountingMap.put("targetClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS));
		printCountingMap.put("sourceClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationTargetClassReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS), element));
			}
			printCountingMap.put("targetClass", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("not");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("derived");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("from");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("sourceClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationSourceClassReferenceResolver().deResolve((dsltrans.PositiveMatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("sourceClass", count - 1);
		}
	}
	
	
	public void print_dsltrans_Import(dsltrans.Import element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("target");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportTargetReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET), element));
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportSourceReferenceResolver().deResolve((dsltrans.PositiveMatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_dsltrans_Atom(dsltrans.Atom element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATOM__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATOM__VALUE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATOM__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_dsltrans_AttributeRef(dsltrans.AttributeRef element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF));
		printCountingMap.put("attributeRef", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("sameAs");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("attributeRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeRefAttributeRefReferenceResolver().deResolve((dsltrans.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF), element));
				out.print(" ");
			}
			printCountingMap.put("attributeRef", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_dsltrans_ClassRef(dsltrans.ClassRef element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF));
		printCountingMap.put("classRef", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("sameAs");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("classRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassRefClassRefReferenceResolver().deResolve((dsltrans.AbstractClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF), element));
				out.print(" ");
			}
			printCountingMap.put("classRef", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_dsltrans_Concat(dsltrans.Concat element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CONCAT__LEFT_TERM));
		printCountingMap.put("leftTerm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CONCAT__RIGHT_TERM));
		printCountingMap.put("rightTerm", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("concat");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CONCAT__LEFT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("with");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightTerm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CONCAT__RIGHT_TERM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightTerm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_dsltrans_TypeOf(dsltrans.TypeOf element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF));
		printCountingMap.put("attributeRef", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("typeOf");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("attributeRef");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeRefAttributeRefReferenceResolver().deResolve((dsltrans.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF), element));
				out.print(" ");
			}
			printCountingMap.put("attributeRef", count - 1);
		}
	}
	
	
	public void print_dsltrans_Wildcard(dsltrans.Wildcard element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("WILDCARD");
		out.print(" ");
	}
	
	
	public void print_dsltrans_isNull(dsltrans.isNull element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IS_NULL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("isNull");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IS_NULL__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_dsltrans_Sequencer(dsltrans.Sequencer element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("Sequence.nextValue");
		out.print(" ");
	}
	
	
	public void print_dsltrans_AttributeEquality(dsltrans.AttributeEquality element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE));
		printCountingMap.put("sourceAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE));
		printCountingMap.put("targetAttribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("sourceAttribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationSourceAttributeReferenceResolver().deResolve((dsltrans.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("sourceAttribute", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetAttribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationTargetAttributeReferenceResolver().deResolve((dsltrans.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("targetAttribute", count - 1);
		}
	}
	
	
	public void print_dsltrans_AttributeInequality(dsltrans.AttributeInequality element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE));
		printCountingMap.put("sourceAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE));
		printCountingMap.put("targetAttribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("sourceAttribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationSourceAttributeReferenceResolver().deResolve((dsltrans.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("sourceAttribute", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("<>");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetAttribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationTargetAttributeReferenceResolver().deResolve((dsltrans.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("targetAttribute", count - 1);
		}
	}
	
	
	public void print_dsltrans_MatchMayBeSameRelation(dsltrans.MatchMayBeSameRelation element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("allow");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver().deResolve((dsltrans.MatchClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_dsltrans_ApplyMayBeSameRelation(dsltrans.ApplyMayBeSameRelation element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__ASSOCIATION_NAME));
		printCountingMap.put("associationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("allow");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationSourceReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE), element));
				out.print(" ");
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET));
			if (o != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationTargetReferenceResolver().deResolve((dsltrans.ApplyClass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET)), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
}
