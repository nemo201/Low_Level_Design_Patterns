package v1;

public class FIleSystemApp {
	public static void main(String[] args) {
		FileSystem fs = new FileSystem();
		
		fs.mkdir("/home");
		fs.mkdir("/home/user");
		
		fs.createFile("/home/user/file.txt");
		
		fs.writeFile("/home/user/file.txt", "Hello world!");
		
		System.out.println(fs.readFile("/home/user/file.txt"));
		System.out.println(fs.ls("/home/user/"));
		System.out.println(fs.ls("/home"));
	}
}
