/*
 * 
 */
package dsltrans.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import dsltrans.DsltransPackage;
import dsltrans.diagram.edit.parts.AnyMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.ApplyAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeAttributeNameEditPart;
import dsltrans.diagram.edit.parts.ApplyClassClassNameEditPart;
import dsltrans.diagram.edit.parts.ApplyMayBeSameRelationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.AtomValue2EditPart;
import dsltrans.diagram.edit.parts.AtomValue3EditPart;
import dsltrans.diagram.edit.parts.AtomValue4EditPart;
import dsltrans.diagram.edit.parts.AtomValueEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.FilePortFilePathURIEditPart;
import dsltrans.diagram.edit.parts.IsNullValueEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeAttributeNameEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierMetaModelNameEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.RuleDescriptionEditPart;
import dsltrans.diagram.edit.parts.SequentialDescriptionEditPart;
import dsltrans.diagram.parsers.MessageFormatParser;
import dsltrans.diagram.part.DsltransVisualIDRegistry;

/**
 * @generated
 */
public class DsltransParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sequentialDescription_5034Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialDescription_5034Parser() {
		if (sequentialDescription_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getLayer_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequentialDescription_5034Parser = parser;
		}
		return sequentialDescription_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser filePortFilePathURI_5035Parser;

	/**
	 * @generated
	 */
	private IParser getFilePortFilePathURI_5035Parser() {
		if (filePortFilePathURI_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getFilePort_FilePathURI() };
			MessageFormatParser parser = new MessageFormatParser(features);
			filePortFilePathURI_5035Parser = parser;
		}
		return filePortFilePathURI_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser metaModelIdentifierMetaModelName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getMetaModelIdentifierMetaModelName_5001Parser() {
		if (metaModelIdentifierMetaModelName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getMetaModelIdentifier_MetaModelName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			metaModelIdentifierMetaModelName_5001Parser = parser;
		}
		return metaModelIdentifierMetaModelName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser ruleDescription_5033Parser;

	/**
	 * @generated
	 */
	private IParser getRuleDescription_5033Parser() {
		if (ruleDescription_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getRule_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ruleDescription_5033Parser = parser;
		}
		return ruleDescription_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser anyMatchClassClassName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAnyMatchClassClassName_5005Parser() {
		if (anyMatchClassClassName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			anyMatchClassClassName_5005Parser = parser;
		}
		return anyMatchClassClassName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchAttributeAttributeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getMatchAttributeAttributeName_5004Parser() {
		if (matchAttributeAttributeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAttribute_AttributeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			matchAttributeAttributeName_5004Parser = parser;
		}
		return matchAttributeAttributeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5002Parser() {
		if (atomValue_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5002Parser = parser;
		}
		return atomValue_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser isNullValue_5003Parser;

	/**
	 * @generated
	 */
	private IParser getIsNullValue_5003Parser() {
		if (isNullValue_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getisNull_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			isNullValue_5003Parser = parser;
		}
		return isNullValue_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser existsMatchClassClassName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getExistsMatchClassClassName_5006Parser() {
		if (existsMatchClassClassName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			existsMatchClassClassName_5006Parser = parser;
		}
		return existsMatchClassClassName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser negativeMatchClassClassName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getNegativeMatchClassClassName_5007Parser() {
		if (negativeMatchClassClassName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			negativeMatchClassClassName_5007Parser = parser;
		}
		return negativeMatchClassClassName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyClassClassName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getApplyClassClassName_5031Parser() {
		if (applyClassClassName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAbstractClass_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyClassClassName_5031Parser = parser;
		}
		return applyClassClassName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyAttributeAttributeName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getApplyAttributeAttributeName_5030Parser() {
		if (applyAttributeAttributeName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAttribute_AttributeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyAttributeAttributeName_5030Parser = parser;
		}
		return applyAttributeAttributeName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5010Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5010Parser() {
		if (atomValue_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5010Parser = parser;
		}
		return atomValue_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5015Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5015Parser() {
		if (atomValue_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5015Parser = parser;
		}
		return atomValue_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomValue_5018Parser;

	/**
	 * @generated
	 */
	private IParser getAtomValue_5018Parser() {
		if (atomValue_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAtom_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atomValue_5018Parser = parser;
		}
		return atomValue_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser negativeIndirectAssociationAssociationName_6010Parser;

	/**
	 * @generated
	 */
	private IParser getNegativeIndirectAssociationAssociationName_6010Parser() {
		if (negativeIndirectAssociationAssociationName_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			negativeIndirectAssociationAssociationName_6010Parser = parser;
		}
		return negativeIndirectAssociationAssociationName_6010Parser;
	}

	/**
	 * @generated
	 */
	private IParser positiveMatchAssociationAssociationName_6011Parser;

	/**
	 * @generated
	 */
	private IParser getPositiveMatchAssociationAssociationName_6011Parser() {
		if (positiveMatchAssociationAssociationName_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			positiveMatchAssociationAssociationName_6011Parser = parser;
		}
		return positiveMatchAssociationAssociationName_6011Parser;
	}

	/**
	 * @generated
	 */
	private IParser negativeMatchAssociationAssociationName_6012Parser;

	/**
	 * @generated
	 */
	private IParser getNegativeMatchAssociationAssociationName_6012Parser() {
		if (negativeMatchAssociationAssociationName_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			negativeMatchAssociationAssociationName_6012Parser = parser;
		}
		return negativeMatchAssociationAssociationName_6012Parser;
	}

	/**
	 * @generated
	 */
	private IParser matchMayBeSameRelationAssociationName_6013Parser;

	/**
	 * @generated
	 */
	private IParser getMatchMayBeSameRelationAssociationName_6013Parser() {
		if (matchMayBeSameRelationAssociationName_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			matchMayBeSameRelationAssociationName_6013Parser = parser;
		}
		return matchMayBeSameRelationAssociationName_6013Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyMayBeSameRelationAssociationName_6014Parser;

	/**
	 * @generated
	 */
	private IParser getApplyMayBeSameRelationAssociationName_6014Parser() {
		if (applyMayBeSameRelationAssociationName_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyMayBeSameRelationAssociationName_6014Parser = parser;
		}
		return applyMayBeSameRelationAssociationName_6014Parser;
	}

	/**
	 * @generated
	 */
	private IParser applyAssociationAssociationName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getApplyAssociationAssociationName_6005Parser() {
		if (applyAssociationAssociationName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { DsltransPackage.eINSTANCE
					.getAssociation_AssociationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applyAssociationAssociationName_6005Parser = parser;
		}
		return applyAssociationAssociationName_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SequentialDescriptionEditPart.VISUAL_ID:
			return getSequentialDescription_5034Parser();
		case FilePortFilePathURIEditPart.VISUAL_ID:
			return getFilePortFilePathURI_5035Parser();
		case MetaModelIdentifierMetaModelNameEditPart.VISUAL_ID:
			return getMetaModelIdentifierMetaModelName_5001Parser();
		case RuleDescriptionEditPart.VISUAL_ID:
			return getRuleDescription_5033Parser();
		case AnyMatchClassClassNameEditPart.VISUAL_ID:
			return getAnyMatchClassClassName_5005Parser();
		case MatchAttributeAttributeNameEditPart.VISUAL_ID:
			return getMatchAttributeAttributeName_5004Parser();
		case AtomValueEditPart.VISUAL_ID:
			return getAtomValue_5002Parser();
		case IsNullValueEditPart.VISUAL_ID:
			return getIsNullValue_5003Parser();
		case ExistsMatchClassClassNameEditPart.VISUAL_ID:
			return getExistsMatchClassClassName_5006Parser();
		case NegativeMatchClassClassNameEditPart.VISUAL_ID:
			return getNegativeMatchClassClassName_5007Parser();
		case ApplyClassClassNameEditPart.VISUAL_ID:
			return getApplyClassClassName_5031Parser();
		case ApplyAttributeAttributeNameEditPart.VISUAL_ID:
			return getApplyAttributeAttributeName_5030Parser();
		case AtomValue2EditPart.VISUAL_ID:
			return getAtomValue_5010Parser();
		case AtomValue3EditPart.VISUAL_ID:
			return getAtomValue_5015Parser();
		case AtomValue4EditPart.VISUAL_ID:
			return getAtomValue_5018Parser();
		case NegativeIndirectAssociationAssociationNameEditPart.VISUAL_ID:
			return getNegativeIndirectAssociationAssociationName_6010Parser();
		case PositiveMatchAssociationAssociationNameEditPart.VISUAL_ID:
			return getPositiveMatchAssociationAssociationName_6011Parser();
		case NegativeMatchAssociationAssociationNameEditPart.VISUAL_ID:
			return getNegativeMatchAssociationAssociationName_6012Parser();
		case MatchMayBeSameRelationAssociationNameEditPart.VISUAL_ID:
			return getMatchMayBeSameRelationAssociationName_6013Parser();
		case ApplyMayBeSameRelationAssociationNameEditPart.VISUAL_ID:
			return getApplyMayBeSameRelationAssociationName_6014Parser();
		case ApplyAssociationAssociationNameEditPart.VISUAL_ID:
			return getApplyAssociationAssociationName_6005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DsltransVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DsltransVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DsltransElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
