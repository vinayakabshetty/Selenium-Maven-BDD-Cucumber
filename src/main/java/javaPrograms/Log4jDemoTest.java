package javaPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemoTest {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger("Log4jDemo.class");
		
		System.out.println("Logger Level is set as : "+log.getLevel());
		log.info("INFO");
		log.debug("DEBUG");
		log.warn("WARNING");
		log.error("ERROR");
		log.fatal("FATAL");
	}
}
