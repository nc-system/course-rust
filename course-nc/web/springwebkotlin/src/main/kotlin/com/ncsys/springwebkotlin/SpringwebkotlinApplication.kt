package com.ncsys.springwebkotlin

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringwebkotlinApplication

fun main(args: Array<String>) {

	// Logger logger = LoggerFactory.getLogger(SpringwebkotlinApplication::class)
	runApplication<SpringwebkotlinApplication>(*args)

	// logger.debug("Message Debug");
	// logger.info("Message Info");
	// logger.warn("Message Warning");
	// logger.error("Message Error");
}
