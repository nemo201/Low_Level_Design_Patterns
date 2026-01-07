package v1;

public class RateLimiter {
	private final RedisClient redis;
	
	RateLimiter(RedisClient redis) {
		this.redis = redis;
	}
	
	public boolean allow(String key, RateLmitePolicy policy) {
		long current = redis.increment(key, policy.windowSeconds);
		
		return current <= policy.maxRequsts;
	}
}
