package com.tgt.kotlin.classes

class Employee2 {

    init {
        println("Init block called")
    }

    constructor(i: Int) {
        println("Secondary Constructor :: $i")
    }
}

fun main() {
    Employee2(10)
}