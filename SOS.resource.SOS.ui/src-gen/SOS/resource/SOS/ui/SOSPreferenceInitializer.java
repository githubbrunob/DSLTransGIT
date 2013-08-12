/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

/**
 * A class used to initialize default preference values.
 */
public class SOSPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static SOS.resource.SOS.ui.SOSAntlrTokenHelper tokenHelper = new SOS.resource.SOS.ui.SOSAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = SOS.resource.SOS.ui.SOSUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(SOS.resource.SOS.ui.SOSPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(SOS.resource.SOS.ui.SOSPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = SOS.resource.SOS.ui.SOSUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new SOS.resource.SOS.mopp.SOSMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = SOS.resource.SOS.ui.SOSUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new SOS.resource.SOS.mopp.SOSMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, SOS.resource.SOS.ISOSMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		SOS.resource.SOS.ui.SOSBracketSet bracketSet = new SOS.resource.SOS.ui.SOSBracketSet(null, null);
		final java.util.Collection<SOS.resource.SOS.ISOSBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (SOS.resource.SOS.ISOSBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + SOS.resource.SOS.ui.SOSPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, SOS.resource.SOS.ISOSMetaInformation metaInformation) {
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
			SOS.resource.SOS.ISOSTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(SOS.resource.SOS.ui.SOSSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, SOS.resource.SOS.ui.SOSSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(SOS.resource.SOS.ui.SOSSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, SOS.resource.SOS.ui.SOSSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(SOS.resource.SOS.ui.SOSSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, SOS.resource.SOS.ui.SOSSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(SOS.resource.SOS.ui.SOSSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, SOS.resource.SOS.ui.SOSSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(SOS.resource.SOS.ui.SOSSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, SOS.resource.SOS.ui.SOSSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(SOS.resource.SOS.ui.SOSSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, SOS.resource.SOS.ui.SOSSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
