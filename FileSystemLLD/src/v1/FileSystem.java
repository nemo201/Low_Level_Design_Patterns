package v1;

import java.util.List;

public class FileSystem {
	private final Directory root = new Directory("/");
	private final PathResolver resolver = new PathResolver();
	
	public void mkdir(String path) {
		String parentPath = path.substring(0, path.lastIndexOf('/'));
		String dirName = path.substring(path.lastIndexOf('/') + 1);
		
		Directory parent = (Directory)(parentPath.isEmpty() ? root : resolver.resolve(parentPath, root));
		
		parent.add(new Directory(dirName));
	}
	
	public void createFile(String path) {
		String parentPath = path.substring(0, path.lastIndexOf('/'));
		String fileName = path.substring(path.lastIndexOf('/') + 1);
		
		Directory parent = (Directory)((parentPath.isEmpty() ? root : resolver.resolve(parentPath, root)));
		parent.add(new File(fileName));
	}
	
	public void writeFile(String path, String data) {
		File file = (File) resolver.resolve(path, root);
		file.write(data);
	}
	
	public String readFile(String path) {
		File file = (File) resolver.resolve(path, root);
		return file.read();
	}
	
	public List<String> ls(String path) {
		Directory dir = (Directory) (path.equals("/") ? root : resolver.resolve(path, root));
		return dir.list();
	}
}
