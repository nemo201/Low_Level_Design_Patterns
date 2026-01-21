package v1;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	private final int capacity;
	private final Map<Integer, Node> cache;
	private final DoublyLinkedList dll;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new HashMap<>();
		this.dll = new DoublyLinkedList();
	}
	
	public int get(int key) {
		if (!cache.containsKey(key)) {
			return -1;
		}
		
		Node node = cache.get(key);
		dll.removeNode(node);
		dll.addToFront(node);
		return node.val;
	}
	
	public void put(int key, int value) {
		if (cache.containsKey(key)) {
			Node node = cache.get(key);
			node.val = value;
			dll.removeNode(node);
			dll.addToFront(node);
			return;
		}
		
		if (cache.size() == capacity) {
			Node lru = dll.removeLast();
			cache.remove(lru.key);
		}
		
		Node newNode = new Node(key, value);
		cache.put(key, newNode);
		dll.addToFront(newNode);
	}
	
	public void printCache() {
		for (Map.Entry<Integer, Node> entry : cache.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().val);
		}
	}
}
