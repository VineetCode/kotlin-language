package com.tgt.kotlin.types

fun main() {

    //Integer Division
    val  a = 5 / 2
    //println(a == 2.5) //ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(a)
    println(a == 2) //true

    val b = 5L / 2
    println(b == 2L) //true

    //Floating-point  Division
    val c = 5 / 2.toDouble()
    println(c == 2.5) //true

    val d = 5.toDouble() / 2
    println(d == 2.5) //true

    //Bitwise Operation
    val e = (1 shl 2) and 0x000FF00
    println(e)

}