package simpleLogger;

public class Logger {
	private static Logger instance;
	private LogLevel currentLevel;
	private Appender appender;
	
	private Logger(LogLevel level, Appender appender) {
		this.currentLevel = level;
		this.appender = appender;
	}
	
	//singleton pattern
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger(LogLevel.INFO, new ConsoleAppender());
		}
		return instance;
	}
	
	public void setLevel(LogLevel level) {
		this.currentLevel = level;
	}
	
	public void log(LogLevel level, String message) {
		if (level.getPriority() >= currentLevel.getPriority()) {
			appender.append(new LogMessage(level, message));
		}
	}
	
	public void debug(String message) {
		log(LogLevel.DEBUG, message);
	}
	
	public void info(String message) {
		log(LogLevel.INFO, message);
	}
	
	public void error(String message) {
		log(LogLevel.ERROR, message);
	}
}
