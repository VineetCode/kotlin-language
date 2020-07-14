package com.tgt.kotlin.classes

class Employee constructor(firstName: String, lastName: String, address: String) {

    private val fullName = "${lastName.trim()}, ${firstName.trim()}"

    init {
        println("First initializer block")
    }

    private val fullAddress = "${address.trim()}, KA, INDIA"

    init {
        println("Second initializer block")
        println("""
            name : $fullName
            address : $fullAddress
                """.trimIndent()
                )
    }
}

fun main() {
    Employee("Vineet", "Singh", "Bangalore")
}