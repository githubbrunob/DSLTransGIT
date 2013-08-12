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
import dsltrans.diagram.edit.parts.AtomValue2EditPart;
import dsltrans.diagram.edit.parts.AtomValue3EditPart;
import dsltrans.diagram.edit.parts.AtomValue4EditPart;
import dsltrans.diagram.edit.parts.AtomValueEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.FilePortFilePathURIEditPart;
import dsltrans.diagram.edit.parts.IsNullValueEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeAttributeNameEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierMetaModelNameEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassClassNameEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationAssociationNameEditPart;
import dsltrans.diagram.edit.parts.RuleDescriptionEditPart;
import dsltrans.diagram.edit.parts.SequentialDescriptionEditPart;
import dsltrans.diagram.edit.parts.WrappingLabel10EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel11EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel12EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel13EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel14EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel15EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel16EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel17EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel18EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel19EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel20EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel2EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel3EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel4EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel5EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel6EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel7EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel8EditPart;
import dsltrans.diagram.edit.parts.WrappingLabel9EditPart;
import dsltrans.diagram.edit.parts.WrappingLabelEditPart;
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
	private IParser matchModelLabel_5008Parser;

	/**
	 * @generated
	 */
	private IParser getMatchModelLabel_5008Parser() {
		if (matchModelLabel_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			matchModelLabel_5008Parser = parser;
		}
		return matchModelLabel_5008Parser;
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
	private IParser applyModelLabel_5032Parser;

	/**
	 * @generated
	 */
	private IParser getApplyModelLabel_5032Parser() {
		if (applyModelLabel_5032Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			applyModelLabel_5032Parser = parser;
		}
		return applyModelLabel_5032Parser;
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
	private IParser typeOfLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getTypeOfLabel_5009Parser() {
		if (typeOfLabel_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			typeOfLabel_5009Parser = parser;
		}
		return typeOfLabel_5009Parser;
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
	private IParser attributeRefLabel_5011Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeRefLabel_5011Parser() {
		if (attributeRefLabel_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeRefLabel_5011Parser = parser;
		}
		return attributeRefLabel_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser classRefLabel_5012Parser;

	/**
	 * @generated
	 */
	private IParser getClassRefLabel_5012Parser() {
		if (classRefLabel_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			classRefLabel_5012Parser = parser;
		}
		return classRefLabel_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser concatLabel_5027Parser;

	/**
	 * @generated
	 */
	private IParser getConcatLabel_5027Parser() {
		if (concatLabel_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			concatLabel_5027Parser = parser;
		}
		return concatLabel_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeOfLabel_5013Parser;

	/**
	 * @generated
	 */
	private IParser getTypeOfLabel_5013Parser() {
		if (typeOfLabel_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			typeOfLabel_5013Parser = parser;
		}
		return typeOfLabel_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeOfLabel_5014Parser;

	/**
	 * @generated
	 */
	private IParser getTypeOfLabel_5014Parser() {
		if (typeOfLabel_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			typeOfLabel_5014Parser = parser;
		}
		return typeOfLabel_5014Parser;
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
	private IParser attributeRefLabel_5016Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeRefLabel_5016Parser() {
		if (attributeRefLabel_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeRefLabel_5016Parser = parser;
		}
		return attributeRefLabel_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser classRefLabel_5017Parser;

	/**
	 * @generated
	 */
	private IParser getClassRefLabel_5017Parser() {
		if (classRefLabel_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			classRefLabel_5017Parser = parser;
		}
		return classRefLabel_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser concatLabel_5026Parser;

	/**
	 * @generated
	 */
	private IParser getConcatLabel_5026Parser() {
		if (concatLabel_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			concatLabel_5026Parser = parser;
		}
		return concatLabel_5026Parser;
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
	private IParser attributeRefLabel_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeRefLabel_5019Parser() {
		if (attributeRefLabel_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeRefLabel_5019Parser = parser;
		}
		return attributeRefLabel_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser classRefLabel_5020Parser;

	/**
	 * @generated
	 */
	private IParser getClassRefLabel_5020Parser() {
		if (classRefLabel_5020Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			classRefLabel_5020Parser = parser;
		}
		return classRefLabel_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser concatLabel_5025Parser;

	/**
	 * @generated
	 */
	private IParser getConcatLabel_5025Parser() {
		if (concatLabel_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			concatLabel_5025Parser = parser;
		}
		return concatLabel_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser wildcardLabel_5021Parser;

	/**
	 * @generated
	 */
	private IParser getWildcardLabel_5021Parser() {
		if (wildcardLabel_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			wildcardLabel_5021Parser = parser;
		}
		return wildcardLabel_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequencerLabel_5022Parser;

	/**
	 * @generated
	 */
	private IParser getSequencerLabel_5022Parser() {
		if (sequencerLabel_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			sequencerLabel_5022Parser = parser;
		}
		return sequencerLabel_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser wildcardLabel_5023Parser;

	/**
	 * @generated
	 */
	private IParser getWildcardLabel_5023Parser() {
		if (wildcardLabel_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			wildcardLabel_5023Parser = parser;
		}
		return wildcardLabel_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequencerLabel_5024Parser;

	/**
	 * @generated
	 */
	private IParser getSequencerLabel_5024Parser() {
		if (sequencerLabel_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			sequencerLabel_5024Parser = parser;
		}
		return sequencerLabel_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser wildcardLabel_5028Parser;

	/**
	 * @generated
	 */
	private IParser getWildcardLabel_5028Parser() {
		if (wildcardLabel_5028Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			wildcardLabel_5028Parser = parser;
		}
		return wildcardLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequencerLabel_5029Parser;

	/**
	 * @generated
	 */
	private IParser getSequencerLabel_5029Parser() {
		if (sequencerLabel_5029Parser == null) {
			EAttribute[] features = new EAttribute[] {

			};
			MessageFormatParser parser = new MessageFormatParser(features);
			sequencerLabel_5029Parser = parser;
		}
		return sequencerLabel_5029Parser;
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
		case WrappingLabelEditPart.VISUAL_ID:
			return getMatchModelLabel_5008Parser();
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
		case WrappingLabel2EditPart.VISUAL_ID:
			return getApplyModelLabel_5032Parser();
		case ApplyClassClassNameEditPart.VISUAL_ID:
			return getApplyClassClassName_5031Parser();
		case ApplyAttributeAttributeNameEditPart.VISUAL_ID:
			return getApplyAttributeAttributeName_5030Parser();
		case WrappingLabel3EditPart.VISUAL_ID:
			return getTypeOfLabel_5009Parser();
		case AtomValue2EditPart.VISUAL_ID:
			return getAtomValue_5010Parser();
		case WrappingLabel4EditPart.VISUAL_ID:
			return getAttributeRefLabel_5011Parser();
		case WrappingLabel5EditPart.VISUAL_ID:
			return getClassRefLabel_5012Parser();
		case WrappingLabel6EditPart.VISUAL_ID:
			return getConcatLabel_5027Parser();
		case WrappingLabel7EditPart.VISUAL_ID:
			return getTypeOfLabel_5013Parser();
		case WrappingLabel8EditPart.VISUAL_ID:
			return getTypeOfLabel_5014Parser();
		case AtomValue3EditPart.VISUAL_ID:
			return getAtomValue_5015Parser();
		case WrappingLabel9EditPart.VISUAL_ID:
			return getAttributeRefLabel_5016Parser();
		case WrappingLabel10EditPart.VISUAL_ID:
			return getClassRefLabel_5017Parser();
		case WrappingLabel11EditPart.VISUAL_ID:
			return getConcatLabel_5026Parser();
		case AtomValue4EditPart.VISUAL_ID:
			return getAtomValue_5018Parser();
		case WrappingLabel12EditPart.VISUAL_ID:
			return getAttributeRefLabel_5019Parser();
		case WrappingLabel13EditPart.VISUAL_ID:
			return getClassRefLabel_5020Parser();
		case WrappingLabel14EditPart.VISUAL_ID:
			return getConcatLabel_5025Parser();
		case WrappingLabel15EditPart.VISUAL_ID:
			return getWildcardLabel_5021Parser();
		case WrappingLabel16EditPart.VISUAL_ID:
			return getSequencerLabel_5022Parser();
		case WrappingLabel17EditPart.VISUAL_ID:
			return getWildcardLabel_5023Parser();
		case WrappingLabel18EditPart.VISUAL_ID:
			return getSequencerLabel_5024Parser();
		case WrappingLabel19EditPart.VISUAL_ID:
			return getWildcardLabel_5028Parser();
		case WrappingLabel20EditPart.VISUAL_ID:
			return getSequencerLabel_5029Parser();
		case NegativeIndirectAssociationAssociationNameEditPart.VISUAL_ID:
			return getNegativeIndirectAssociationAssociationName_6010Parser();
		case PositiveMatchAssociationAssociationNameEditPart.VISUAL_ID:
			return getPositiveMatchAssociationAssociationName_6011Parser();
		case NegativeMatchAssociationAssociationNameEditPart.VISUAL_ID:
			return getNegativeMatchAssociationAssociationName_6012Parser();
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
