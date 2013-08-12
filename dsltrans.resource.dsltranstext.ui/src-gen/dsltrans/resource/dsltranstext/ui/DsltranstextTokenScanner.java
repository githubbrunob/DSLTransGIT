/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class DsltranstextTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private dsltrans.resource.dsltranstext.IDsltranstextTextScanner lexer;
	private dsltrans.resource.dsltranstext.IDsltranstextTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private dsltrans.resource.dsltranstext.ui.DsltranstextColorManager colorManager;
	private dsltrans.resource.dsltranstext.IDsltranstextTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public DsltranstextTokenScanner(dsltrans.resource.dsltranstext.IDsltranstextTextResource resource, dsltrans.resource.dsltranstext.ui.DsltranstextColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation().createLexer();
		this.languageId = new dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation().getSyntaxName();
		this.store = dsltrans.resource.dsltranstext.ui.DsltranstextUIPlugin.getDefault().getPreferenceStore();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		dsltrans.resource.dsltranstext.mopp.DsltranstextDynamicTokenStyler dynamicTokenStyler = new dsltrans.resource.dsltranstext.mopp.DsltranstextDynamicTokenStyler();
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.ENABLE);
			boolean enabled = store.getBoolean(enableKey);
			dsltrans.resource.dsltranstext.IDsltranstextTokenStyle staticStyle = null;
			if (enabled) {
				String colorKey = dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
				org.eclipse.swt.graphics.RGB backgroundRGB = null;
				boolean bold = store.getBoolean(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.BOLD));
				boolean italic = store.getBoolean(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.ITALIC));
				boolean strikethrough = store.getBoolean(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
				boolean underline = store.getBoolean(dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, dsltrans.resource.dsltranstext.ui.DsltranstextSyntaxColoringHelper.StyleProperty.UNDERLINE));
				// now call dynamic token styler to allow to apply modifications to the static
				// style
				staticStyle = new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
			}
			dsltrans.resource.dsltranstext.IDsltranstextTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
			if (dynamicStyle != null) {
				int[] foregroundColorArray = dynamicStyle.getColorAsRGB();
				org.eclipse.swt.graphics.Color foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
				int[] backgroundColorArray = dynamicStyle.getBackgroundColorAsRGB();
				org.eclipse.swt.graphics.Color backgroundColor = null;
				if (backgroundColorArray != null) {
					org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
					backgroundColor = colorManager.getColor(backgroundRGB);
				}
				int style = org.eclipse.swt.SWT.NORMAL;
				if (dynamicStyle.isBold()) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (dynamicStyle.isItalic()) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (dynamicStyle.isStrikethrough()) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (dynamicStyle.isUnderline()) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
}
