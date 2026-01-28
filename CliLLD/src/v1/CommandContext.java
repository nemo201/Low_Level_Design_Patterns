package v1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommandContext {
	Map<String, String> options;
	Set<String> flags;
	List<String> arguments;
	
	CommandContext(Map<String, String> options, Set<String> flags, List<String> arguments) {
		this.options = options;
		this.flags = flags;
		this.arguments = arguments;
	}
}
