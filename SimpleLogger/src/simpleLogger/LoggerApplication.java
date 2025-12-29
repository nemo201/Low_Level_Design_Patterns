package simpleLogger;

public class LoggerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getInstance();
		
		logger.debug("This is a DEBUG log");   // ignored (default INFO)
        logger.info("Application started");
        logger.error("Something went wrong");
		
		logger.setLevel(LogLevel.DEBUG);
		
		logger.debug("Debugging enabled");
		logger.info("Processing request");
	}

}
