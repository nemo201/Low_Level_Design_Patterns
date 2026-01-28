package v1;

public class Main {
	public static void main(String[] args) {
		CLIApplication app = new CLIApplication();
		app.registerCommand(new InitCommand());
		if (args == null || args.length == 0) {
            args = new String[] { "init" }; // use the actual command name your CLI expects
        }
        app.run(args);
	}
}
