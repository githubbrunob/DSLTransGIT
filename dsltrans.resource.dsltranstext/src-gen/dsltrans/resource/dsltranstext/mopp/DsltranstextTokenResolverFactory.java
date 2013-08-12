/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * The DsltranstextTokenResolverFactory class provides access to all generated
 * token resolvers. By giving the name of a defined token, the corresponding
 * resolve can be obtained. Despite the fact that this class is called
 * TokenResolverFactory is does NOT create new token resolvers whenever a client
 * calls methods to obtain a resolver. Rather, this class maintains a map of all
 * resolvers and creates each resolver at most once.
 */
public class DsltranstextTokenResolverFactory implements dsltrans.resource.dsltranstext.IDsltranstextTokenResolverFactory {
	
	private java.util.Map<String, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver> featureName2CollectInTokenResolver;
	private static dsltrans.resource.dsltranstext.IDsltranstextTokenResolver defaultResolver = new dsltrans.resource.dsltranstext.analysis.DsltranstextDefaultTokenResolver();
	
	public DsltranstextTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver>();
		registerTokenResolver("IDENTIFIER", new dsltrans.resource.dsltranstext.analysis.DsltranstextIDENTIFIERTokenResolver());
		registerTokenResolver("DESCCOM", new dsltrans.resource.dsltranstext.analysis.DsltranstextDESCCOMTokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new dsltrans.resource.dsltranstext.analysis.DsltranstextQUOTED_39_39_92TokenResolver());
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected dsltrans.resource.dsltranstext.IDsltranstextTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private dsltrans.resource.dsltranstext.IDsltranstextTokenResolver internalCreateResolver(java.util.Map<String, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver> resolverMap, String key, dsltrans.resource.dsltranstext.IDsltranstextTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
