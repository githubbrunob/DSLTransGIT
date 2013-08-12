/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextTokenStyleInformationProvider {
	
	public dsltrans.resource.dsltranstext.IDsltranstextTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("strict".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0xCC, 0x00, 0x00}, null, false, false, false, false);
		}
		if ("DESCCOM".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x00, 0xCC, 0x00}, null, false, false, false, false);
		}
		if ("File".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("id".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("uri".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metamodel".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("mmname".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("def".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("layer".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("previous".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("group".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("output".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("end".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("rule".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("match".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("apply".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("where".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("restrictions".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("import".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("with".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("subject".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("any".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("existing".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("not".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("self".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("derived".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("from".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("target".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("sameAs".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("concat".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("typeOf".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WILDCARD".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isNull".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("allow".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_39_39_92".equals(tokenName)) {
			return new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
