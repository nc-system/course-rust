package com.ncsys.springwebjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebjavaApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringwebjavaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringwebjavaApplication.class, args);

		logger.trace("Message Trace");
		logger.debug("Message Debug");
		logger.info("Message Info");
		logger.warn("Message Warning");
		logger.error("Message Error");
	}

}
