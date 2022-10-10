package com.example.webflux_coroutines_test

import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class HelloService {

    suspend fun hello(): String {
        delay(10)
        return "hello there!"
    }
}