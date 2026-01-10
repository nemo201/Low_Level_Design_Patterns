package v1;

public class File extends Node{
	private StringBuilder content = new StringBuilder();
	
	File(String name) {
		super(name);
	}
	
	public synchronized void write(String data) {
		content.append(data);
		metaData.size = content.length();
	}
	
	public synchronized String read() {
		return content.toString();
	}

}
