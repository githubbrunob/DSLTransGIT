/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlTokenStyleInformationProvider {
	
	public mprolog.resource.pl.IPlTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("VARIABLE".equals(tokenName)) {
			return new mprolog.resource.pl.mopp.PlTokenStyle(new int[] {0x00, 0xFF, 0x10}, null, false, false, false, false);
		}
		if ("ATOM".equals(tokenName)) {
			return new mprolog.resource.pl.mopp.PlTokenStyle(new int[] {0x00, 0x00, 0xFF}, null, true, false, false, false);
		}
		if ("QUOTED_39_39".equals(tokenName)) {
			return new mprolog.resource.pl.mopp.PlTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
