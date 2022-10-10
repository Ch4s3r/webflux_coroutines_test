package com.example.webflux_coroutines_test

import kotlinx.coroutines.coroutineScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    val helloService: HelloService,
) {

    @GetMapping("hello")
    suspend fun hello() =
        helloService.hello() // Set breakpoint here, Option-click on `hello()`

    @GetMapping("helloCoroutine")
    suspend fun helloCoroutine() = coroutineScope {
        helloService.hello() // Set breakpoint here, Option-click on `hello()`
    }
}