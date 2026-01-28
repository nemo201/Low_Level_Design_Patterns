package v1;

public class InitCommand implements Command {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "init";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Initializes a repository";
	}

	@Override
	public void execute(CommandContext context) {
		System.out.println("Repository initialized");
		
	}

}
