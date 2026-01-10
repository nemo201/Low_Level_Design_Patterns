package v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory extends Node{
	private final Map<String, Node> children = new HashMap<>();
	
	Directory(String name) {
		super(name);
	}
	
	public synchronized void add(Node node) {
		if (children.containsKey(node.name)) {
			throw new RuntimeException("Name already exists");
		}
		children.put(node.name, node);
	}
	
	public synchronized Node get(String name) {
		return children.get(name);
	}
	
	public synchronized void remove(String name) {
		children.remove(name);
	}
	
	public synchronized List<String> list() {
		return new ArrayList<>(children.keySet());
	}

}
