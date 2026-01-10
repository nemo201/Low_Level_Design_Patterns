package v1;

abstract public class Node {
	protected String name;
	protected FileMetaData metaData;
	
	Node(String name) {
		this.name = name;
		this.metaData = new FileMetaData();
	}

	public String getName() {
		return name;
	}
}
