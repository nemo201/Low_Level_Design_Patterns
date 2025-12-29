package simpleLogger;

public class LogMessage {
	private LogLevel level;
	private String message;
	private long timestamp;

	public LogMessage(LogLevel level, String message) {
		this.level = level;
		this.message = message;
		this.timestamp = System.currentTimeMillis();
	}

	public LogLevel getLevel() {
		return level;
	}

	public String format() {
		return "[" + level + "] " + "[" + timestamp + "] " + message;
	}
}
