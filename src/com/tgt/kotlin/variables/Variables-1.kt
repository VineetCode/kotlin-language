package com.tgt.kotlin.variables


fun main() {
    var message = "Hello, World!"
    var value = 1000

    println(message)
    println(message::class)

    println(value)
    println(value::class)

     //Try setting message to some other type
     //message = 100
    //println(message)
}