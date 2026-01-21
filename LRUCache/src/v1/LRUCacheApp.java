package v1;

public class LRUCacheApp {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 10);
		cache.put(2, 20);
		System.out.println("get(1) -> " + cache.get(1));    // print return of get
		cache.put(3, 30);
		System.out.println("get(2) -> " + cache.get(2));    // print return of get
		System.out.println("Cache contents:");
		cache.printCache();                                 // still call printCache()
	}

}
