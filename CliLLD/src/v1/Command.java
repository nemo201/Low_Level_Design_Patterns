package v1;

public interface Command {
	String name();
	String description();
	void execute(CommandContext context);
}
