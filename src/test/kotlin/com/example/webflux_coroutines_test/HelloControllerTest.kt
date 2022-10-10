package com.example.webflux_coroutines_test

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import org.springframework.test.context.TestConstructor.AutowireMode.ALL
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
@TestConstructor(autowireMode = ALL)
@AutoConfigureWebTestClient
class HelloControllerTest(
    val webClient: WebTestClient,
) {
    @Test
    fun hello() {
        webClient
            .get()
            .uri("http://localhost:8080/hello")
            .exchange()
            .expectBody()
            .jsonPath("$")
            .isEqualTo("hello there!")
    }

    @Test
    fun helloCoroutine() {
        webClient
            .get()
            .uri("http://localhost:8080/helloCoroutine")
            .exchange()
            .expectBody()
            .jsonPath("$")
            .isEqualTo("hello there!")
    }
}