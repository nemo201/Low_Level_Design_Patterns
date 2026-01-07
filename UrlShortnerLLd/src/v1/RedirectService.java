package v1;

public class RedirectService {
	private final CacheService cache;
	private final AnalyticsService analytics;

	RedirectService(CacheService cache, AnalyticsService analytics) {
		this.cache = cache;
		this.analytics = anlytics;
	}

	public String redirect(String shortCode) {
		if (!rateLimiter.allow(
	            "rl:redirect:ip:" + ip,
	            new RateLimitPolicy(1000, 60))) {
	        throw new RuntimeException("Too many requests");
	    }
		
		String longUrl = cache.get(shortCode);
		if (longUrl == null)
		{
			throw new RuntimeException("URL not found!");
		}
		analytics.recordClick(shortCode);
		return longUrl;
}
