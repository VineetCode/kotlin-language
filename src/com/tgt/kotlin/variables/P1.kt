package com.tgt.kotlin.variables

val PI = 3.14
var x = 0;

fun incrementPI() {
   //PI = PI + 1 //val variable cannot be re-assigned
}

fun incrementX() {
    x += 1
}

fun main() {
    println("x = $x; PI = $PI")
    //Let us invoke the function
    incrementX()
    incrementPI()
    println("x = $x; PI = $PI")
}
