/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * The SOSTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class SOSTokenResolverFactory implements SOS.resource.SOS.ISOSTokenResolverFactory {
	
	private java.util.Map<String, SOS.resource.SOS.ISOSTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, SOS.resource.SOS.ISOSTokenResolver> featureName2CollectInTokenResolver;
	private static SOS.resource.SOS.ISOSTokenResolver defaultResolver = new SOS.resource.SOS.analysis.SOSDefaultTokenResolver();
	
	public SOSTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, SOS.resource.SOS.ISOSTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, SOS.resource.SOS.ISOSTokenResolver>();
		registerTokenResolver("INTEGER", new SOS.resource.SOS.analysis.SOSINTEGERTokenResolver());
		registerTokenResolver("TEXT", new SOS.resource.SOS.analysis.SOSTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new SOS.resource.SOS.analysis.SOSQUOTED_34_34TokenResolver());
	}
	
	public SOS.resource.SOS.ISOSTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public SOS.resource.SOS.ISOSTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, SOS.resource.SOS.ISOSTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, SOS.resource.SOS.ISOSTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected SOS.resource.SOS.ISOSTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private SOS.resource.SOS.ISOSTokenResolver internalCreateResolver(java.util.Map<String, SOS.resource.SOS.ISOSTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, SOS.resource.SOS.ISOSTokenResolver> resolverMap, String key, SOS.resource.SOS.ISOSTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
