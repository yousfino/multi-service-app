package com.servicehub.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BackendApplication

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}

@RestController
@RequestMapping("/api/hello")
class HelloController {

    @GetMapping
    fun hello(): String = "Hello from Kotlin Spring Boot!"
}
