package v1;

import java.util.HashMap;
import java.util.Map;

public class UrlShortningService {
	private final IdGenerator idGenerator;
	private final Map<String, String> cache;
	
	UrlShortningService(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
		this.cache = new HashMap<>();
	}
	
	public ShortUrl create(String longUrl, String userId) {
		if (!rateLimiter.allow(
	            "rl:create:user:" + userId,
	            new RateLimitPolicy(10, 60))) {
	        throw new RuntimeException("Rate limit exceeded");
	    }
		
		long id = System.currentTimeMillis();
		String shortCode = idGenerator.encode(id);
		
		ShortUrl shortUrl = new ShortUrl();
		shortUrl.shortCode = shortCode;
		shortUrl.userId = userId;
		shortUrl.createdAt = id;
		
		cache.put(shortCode, longUrl);
		return shortUrl;
	}
}
