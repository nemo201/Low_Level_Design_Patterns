package v1;

public class PathResolver {
	public Node resolve(String path, Directory root) {
		String[] parts = path.split("/");
		Node current = root;
		
		for (int i = 1; i < parts.length; i++) {
			if (!(current instanceof Directory)) {
				throw new RuntimeException("Invalid path");
			}
			current = ((Directory) current).get(parts[i]);
			if (current == null) {
				throw new RuntimeException("Path not found!");
			}
		}
		return current;
	}
}
