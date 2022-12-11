package com.ncsys.springwebkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringWebKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringWebKotlinApplication>(*args)
}
