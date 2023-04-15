package com.anyject.binancedatastream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BinanceDataStreamApplication

fun main(args: Array<String>) {
    runApplication<BinanceDataStreamApplication>(*args)
}
