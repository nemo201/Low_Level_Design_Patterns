package v1;

public class RateLmitePolicy {
	int maxRequsts;
	int windowSeconds;
	
	RateLmitePolicy(int maxRequsts,	int windowSeconds) {
		this.maxRequsts = maxRequsts;
		this.windowSeconds = windowSeconds;
	}
}
