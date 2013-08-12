/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

/**
 * A TokenResolverFactory creates TokenResolvers. The concrete resolver to be
 * created is determined by the given token name (i.e., the type of the token).
 * One may consider TokenResolverFactories as a registry, which maps token types
 * to TokenResolvers.
 */
public interface ISOSTokenResolverFactory {
	
	/**
	 * Creates a token resolver for normal tokens of type <code>tokenName</code>.
	 */
	public SOS.resource.SOS.ISOSTokenResolver createTokenResolver(String tokenName);
	
	/**
	 * Creates a token resolver for COLLECT-IN tokens that are stored in feature
	 * <code>featureName</code>.
	 */
	public SOS.resource.SOS.ISOSTokenResolver createCollectInTokenResolver(String featureName);
	
}
