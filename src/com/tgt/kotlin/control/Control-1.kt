package com.tgt.kotlin.control

fun main() {

    var a = 1;
    var b = 2;

    //Traditional Usage
    println("-------Traditional Usage---------")
    var max = a
    if (a < b)
        max = b
    println(max)

    println("-----Expression Way-------")
    max = if (a > b) a else b
    println(max)

    println("---------When------------")
    when (a) {
        1 -> println("a==1")
        2 -> println("a==2")
        else -> {
            println("a is neither 1 nor 2")
        }
    }

    when (a) {
        0, 1 -> println("a == 0 or a ==1")
        else -> println("otherwise")
    }

    when (a) {
        in 1..10 -> println("a is in the range")
        !in 10..20 -> println("a is outside the range")
        else -> println("none of the above")
    }

    println(hasPrefix(123))
    println(hasPrefix("prefix123"))
    }
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
