package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableCaching
class CrmApplication

fun main(args: Array<String>) {
	runApplication<CrmApplication>(*args)
}
