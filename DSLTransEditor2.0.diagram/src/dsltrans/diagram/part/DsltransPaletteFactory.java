/*
 * 
 */
package dsltrans.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class DsltransPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnyMatchClass1CreationTool());
		paletteContainer.add(createApplyAttribute2CreationTool());
		paletteContainer.add(createApplyClass3CreationTool());
		paletteContainer.add(createApplyModel4CreationTool());
		paletteContainer.add(createAtom5CreationTool());
		paletteContainer.add(createAttributeRef6CreationTool());
		paletteContainer.add(createClassRef7CreationTool());
		paletteContainer.add(createConcat8CreationTool());
		paletteContainer.add(createExistsMatchClass9CreationTool());
		paletteContainer.add(createFilePort10CreationTool());
		paletteContainer.add(createLayer11CreationTool());
		paletteContainer.add(createMatchAttribute12CreationTool());
		paletteContainer.add(createMatchModel13CreationTool());
		paletteContainer.add(createMetaModelIdentifier14CreationTool());
		paletteContainer.add(createNegativeMatchClass15CreationTool());
		paletteContainer.add(createRule16CreationTool());
		paletteContainer.add(createSequencer17CreationTool());
		paletteContainer.add(createTypeOf18CreationTool());
		paletteContainer.add(createWildcard19CreationTool());
		paletteContainer.add(createIsNull20CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createApplyAssociation1CreationTool());
		paletteContainer.add(createApplyMayBeSameRelation2CreationTool());
		paletteContainer.add(createAttributeEquality3CreationTool());
		paletteContainer.add(createAttributeInequality4CreationTool());
		paletteContainer.add(createAttributeRef5CreationTool());
		paletteContainer.add(createClassRef6CreationTool());
		paletteContainer.add(createExplicitSource7CreationTool());
		paletteContainer.add(createImport8CreationTool());
		paletteContainer.add(createMatchMayBeSameRelation9CreationTool());
		paletteContainer.add(createNegativeBackwardRestriction10CreationTool());
		paletteContainer.add(createNegativeIndirectAssociation11CreationTool());
		paletteContainer.add(createNegativeMatchAssociation12CreationTool());
		paletteContainer.add(createPositiveBackwardRestriction13CreationTool());
		paletteContainer.add(createPositiveIndirectAssociation14CreationTool());
		paletteContainer.add(createPositiveMatchAssociation15CreationTool());
		paletteContainer.add(createPreviousSource16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnyMatchClass1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AnyMatchClass1CreationTool_title,
				Messages.AnyMatchClass1CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.AnyMatchClass_3004));
		entry.setId("createAnyMatchClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.AnyMatchClass_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplyAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplyAttribute2CreationTool_title,
				Messages.ApplyAttribute2CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.ApplyAttribute_3012));
		entry.setId("createApplyAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ApplyAttribute_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplyClass3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplyClass3CreationTool_title,
				Messages.ApplyClass3CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.ApplyClass_3011));
		entry.setId("createApplyClass3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ApplyClass_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplyModel4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ApplyModel4CreationTool_title,
				Messages.ApplyModel4CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.ApplyModel_3010));
		entry.setId("createApplyModel4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ApplyModel_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtom5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(DsltransElementTypes.Atom_3006);
		types.add(DsltransElementTypes.Atom_3014);
		types.add(DsltransElementTypes.Atom_3020);
		types.add(DsltransElementTypes.Atom_3024);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Atom5CreationTool_title,
				Messages.Atom5CreationTool_desc, types);
		entry.setId("createAtom5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Atom_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeRef6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsltransElementTypes.AttributeRef_3015);
		types.add(DsltransElementTypes.AttributeRef_3021);
		types.add(DsltransElementTypes.AttributeRef_3025);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AttributeRef6CreationTool_title,
				Messages.AttributeRef6CreationTool_desc, types);
		entry.setId("createAttributeRef6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.AttributeRef_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassRef7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsltransElementTypes.ClassRef_3016);
		types.add(DsltransElementTypes.ClassRef_3022);
		types.add(DsltransElementTypes.ClassRef_3026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClassRef7CreationTool_title,
				Messages.ClassRef7CreationTool_desc, types);
		entry.setId("createClassRef7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ClassRef_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConcat8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsltransElementTypes.Concat_3017);
		types.add(DsltransElementTypes.Concat_3023);
		types.add(DsltransElementTypes.Concat_3027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Concat8CreationTool_title,
				Messages.Concat8CreationTool_desc, types);
		entry.setId("createConcat8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Concat_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExistsMatchClass9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExistsMatchClass9CreationTool_title,
				Messages.ExistsMatchClass9CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.ExistsMatchClass_3008));
		entry.setId("createExistsMatchClass9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ExistsMatchClass_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilePort10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilePort10CreationTool_title,
				Messages.FilePort10CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.FilePort_2002));
		entry.setId("createFilePort10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.FilePort_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLayer11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Layer11CreationTool_title,
				Messages.Layer11CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.Sequential_2001));
		entry.setId("createLayer11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Sequential_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchAttribute12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MatchAttribute12CreationTool_title,
				Messages.MatchAttribute12CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.MatchAttribute_3005));
		entry.setId("createMatchAttribute12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.MatchAttribute_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchModel13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MatchModel13CreationTool_title,
				Messages.MatchModel13CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.MatchModel_3003));
		entry.setId("createMatchModel13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.MatchModel_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetaModelIdentifier14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MetaModelIdentifier14CreationTool_title,
				Messages.MetaModelIdentifier14CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.MetaModelIdentifier_3001));
		entry.setId("createMetaModelIdentifier14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.MetaModelIdentifier_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNegativeMatchClass15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.NegativeMatchClass15CreationTool_title,
				Messages.NegativeMatchClass15CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.NegativeMatchClass_3009));
		entry.setId("createNegativeMatchClass15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.NegativeMatchClass_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRule16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Rule16CreationTool_title,
				Messages.Rule16CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.Rule_3002));
		entry.setId("createRule16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Rule_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequencer17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsltransElementTypes.Sequencer_3029);
		types.add(DsltransElementTypes.Sequencer_3031);
		types.add(DsltransElementTypes.Sequencer_3033);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequencer17CreationTool_title,
				Messages.Sequencer17CreationTool_desc, types);
		entry.setId("createSequencer17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Sequencer_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeOf18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsltransElementTypes.TypeOf_3013);
		types.add(DsltransElementTypes.TypeOf_3018);
		types.add(DsltransElementTypes.TypeOf_3019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TypeOf18CreationTool_title,
				Messages.TypeOf18CreationTool_desc, types);
		entry.setId("createTypeOf18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.TypeOf_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWildcard19CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsltransElementTypes.Wildcard_3028);
		types.add(DsltransElementTypes.Wildcard_3030);
		types.add(DsltransElementTypes.Wildcard_3032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Wildcard19CreationTool_title,
				Messages.Wildcard19CreationTool_desc, types);
		entry.setId("createWildcard19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Wildcard_3028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsNull20CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IsNull20CreationTool_title,
				Messages.IsNull20CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.IsNull_3007));
		entry.setId("createIsNull20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.IsNull_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplyAssociation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ApplyAssociation1CreationTool_title,
				Messages.ApplyAssociation1CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.ApplyAssociation_4005));
		entry.setId("createApplyAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ApplyAssociation_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApplyMayBeSameRelation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ApplyMayBeSameRelation2CreationTool_title,
				Messages.ApplyMayBeSameRelation2CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.ApplyMayBeSameRelation_4018));
		entry.setId("createApplyMayBeSameRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ApplyMayBeSameRelation_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeEquality3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AttributeEquality3CreationTool_title,
				Messages.AttributeEquality3CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.AttributeEquality_4015));
		entry.setId("createAttributeEquality3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.AttributeEquality_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeInequality4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AttributeInequality4CreationTool_title,
				Messages.AttributeInequality4CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.AttributeInequality_4016));
		entry.setId("createAttributeInequality4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.AttributeInequality_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeRef5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AttributeRef5CreationTool_title,
				Messages.AttributeRef5CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.AttributeRefAttributeRef_4013));
		entry.setId("createAttributeRef5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.AttributeRefAttributeRef_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassRef6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ClassRef6CreationTool_title,
				Messages.ClassRef6CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.ClassRefClassRef_4014));
		entry.setId("createClassRef6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.ClassRefClassRef_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExplicitSource7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExplicitSource7CreationTool_title,
				Messages.ExplicitSource7CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.MatchModelExplicitSource_4012));
		entry.setId("createExplicitSource7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.MatchModelExplicitSource_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImport8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Import8CreationTool_title,
				Messages.Import8CreationTool_desc,
				Collections.singletonList(DsltransElementTypes.Import_4010));
		entry.setId("createImport8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.Import_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchMayBeSameRelation9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MatchMayBeSameRelation9CreationTool_title,
				Messages.MatchMayBeSameRelation9CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.MatchMayBeSameRelation_4017));
		entry.setId("createMatchMayBeSameRelation9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.MatchMayBeSameRelation_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNegativeBackwardRestriction10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NegativeBackwardRestriction10CreationTool_title,
				Messages.NegativeBackwardRestriction10CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.NegativeBackwardRestriction_4007));
		entry.setId("createNegativeBackwardRestriction10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.NegativeBackwardRestriction_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNegativeIndirectAssociation11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NegativeIndirectAssociation11CreationTool_title,
				Messages.NegativeIndirectAssociation11CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.NegativeIndirectAssociation_4002));
		entry.setId("createNegativeIndirectAssociation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.NegativeIndirectAssociation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNegativeMatchAssociation12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NegativeMatchAssociation12CreationTool_title,
				Messages.NegativeMatchAssociation12CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.NegativeMatchAssociation_4004));
		entry.setId("createNegativeMatchAssociation12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.NegativeMatchAssociation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPositiveBackwardRestriction13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PositiveBackwardRestriction13CreationTool_title,
				Messages.PositiveBackwardRestriction13CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.PositiveBackwardRestriction_4006));
		entry.setId("createPositiveBackwardRestriction13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.PositiveBackwardRestriction_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPositiveIndirectAssociation14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PositiveIndirectAssociation14CreationTool_title,
				Messages.PositiveIndirectAssociation14CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.PositiveIndirectAssociation_4001));
		entry.setId("createPositiveIndirectAssociation14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.PositiveIndirectAssociation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPositiveMatchAssociation15CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PositiveMatchAssociation15CreationTool_title,
				Messages.PositiveMatchAssociation15CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.PositiveMatchAssociation_4003));
		entry.setId("createPositiveMatchAssociation15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.PositiveMatchAssociation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPreviousSource16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PreviousSource16CreationTool_title,
				Messages.PreviousSource16CreationTool_desc,
				Collections
						.singletonList(DsltransElementTypes.LayerPreviousSource_4011));
		entry.setId("createPreviousSource16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsltransElementTypes
				.getImageDescriptor(DsltransElementTypes.LayerPreviousSource_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
