/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

/**
 * The PlTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class PlTokenResolverFactory implements mprolog.resource.pl.IPlTokenResolverFactory {
	
	private java.util.Map<String, mprolog.resource.pl.IPlTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, mprolog.resource.pl.IPlTokenResolver> featureName2CollectInTokenResolver;
	private static mprolog.resource.pl.IPlTokenResolver defaultResolver = new mprolog.resource.pl.analysis.PlDefaultTokenResolver();
	
	public PlTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, mprolog.resource.pl.IPlTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, mprolog.resource.pl.IPlTokenResolver>();
		registerTokenResolver("VARIABLE", new mprolog.resource.pl.analysis.PlVARIABLETokenResolver());
		registerTokenResolver("ATOM", new mprolog.resource.pl.analysis.PlATOMTokenResolver());
		registerTokenResolver("NUMBER", new mprolog.resource.pl.analysis.PlNUMBERTokenResolver());
		registerTokenResolver("OPERATOR", new mprolog.resource.pl.analysis.PlOPERATORTokenResolver());
		registerTokenResolver("QUOTED_39_39", new mprolog.resource.pl.analysis.PlQUOTED_39_39TokenResolver());
	}
	
	public mprolog.resource.pl.IPlTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public mprolog.resource.pl.IPlTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, mprolog.resource.pl.IPlTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, mprolog.resource.pl.IPlTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected mprolog.resource.pl.IPlTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private mprolog.resource.pl.IPlTokenResolver internalCreateResolver(java.util.Map<String, mprolog.resource.pl.IPlTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, mprolog.resource.pl.IPlTokenResolver> resolverMap, String key, mprolog.resource.pl.IPlTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
