package v1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParsedCommand {
	String commandName;
	Map<String, String> options;
	Set<String> flags;
	List<String> arguments;
}
