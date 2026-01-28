package v1;

public class CLIApplication {
	private final CommandParser parser = new CommandParser();
	private final CommandRegistry registry = new CommandRegistry();
	
	public void registerCommand(Command command) {
		registry.register(command);
	}
	
	public void run(String[] args) {
		if (args.length == 0) {
			System.out.println("No command provided.");
			return;
		}
		
		ParsedCommand parsed = parser.parse(args);
		Command command = registry.get(parsed.commandName);
		
		if (command == null) {
			System.out.println("Unknown command: " + parsed.commandName);
		}
		
		CommandContext context = new CommandContext(
				parsed.options,
				parsed.flags,
				parsed.arguments
		);
		
		command.execute(context);
	}
}
