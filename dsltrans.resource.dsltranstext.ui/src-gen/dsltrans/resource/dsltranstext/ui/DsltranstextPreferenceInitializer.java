/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.ui;

/**
 * A class used to initialize default preference values.
 */
public class DsltranstextPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static dsltrans.resource.dsltranstext.ui.DsltranstextAntlrTokenHelper tokenHelper = new dsltrans.resource.dsltranstext.ui.DsltranstextAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = dsltrans.resource.dsltranstext.ui.DsltranstextUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = dsltrans.resource.dsltranstext.ui.DsltranstextUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = dsltrans.resource.dsltranstext.ui.DsltranstextUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, dsltrans.resource.dsltranstext.IDsltranstextMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		dsltrans.resource.dsltranstext.ui.DsltranstextBracketSet bracketSet = new dsltrans.resource.dsltranstext.ui.DsltranstextBracketSet(null, null);
		final java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (dsltrans.resource.dsltranstext.IDsltranstextBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + dsltrans.resource.dsltranstext.ui.DsltranstextPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, dsltrans.resource.dsltranstext.IDsltranstextMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			dsltrans.resource.dsltranstext.IDsltranstextTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
