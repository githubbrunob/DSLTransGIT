/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSTokenStyleInformationProvider {
	
	public SOS.resource.SOS.ISOSTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("Semantics".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("{".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("}".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Assuming".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Then".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Fact".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if (",".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ADT".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Sorts".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Generators".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Operations".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Axioms".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Where".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Union".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Intersect".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Excluding".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("->".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("->>".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if (";".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if (".".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("(".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if (")".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("=>".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("|-".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("@".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("^".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("=".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("!=".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("class".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("existsIn".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Model".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("|".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Transition".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("System".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Set".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new SOS.resource.SOS.mopp.SOSTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
