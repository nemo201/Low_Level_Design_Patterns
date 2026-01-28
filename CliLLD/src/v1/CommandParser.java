package v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CommandParser {
	public ParsedCommand parse(String[] args) {
		ParsedCommand pc = new ParsedCommand();
		pc.options = new HashMap<>();
		pc.flags = new HashSet<>();
		pc.arguments = new ArrayList<>();
		
		pc.commandName = args[0];
		
		for (int i =1 ; i < args.length; i++) {
			String arg = args[i];
			
			if (arg.startsWith("--")) {
				String[] parts = arg.substring(2).split("=");
				pc.options.put(parts[0], parts.length > 1 ? parts[1] : "");
			} else if (arg.startsWith("-")) {
				pc.flags.add(arg.substring(1));
			} else {
				pc.arguments.add(arg);
			}
		}
		return pc;
	}
	
}
