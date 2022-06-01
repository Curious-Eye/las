package com.las.bank.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankCoreApplication

fun main(args: Array<String>) {
    runApplication<BankCoreApplication>(*args)
}