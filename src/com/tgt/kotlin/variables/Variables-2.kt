package com.tgt.kotlin.variables

fun main() {
    val a : Int = 1 //Immediate assignment
    val b = 2      //'Int' type is inferred
    val c : Int   // Type required when no initializer is provided

    c = 3 //deferred assignment
    println("a = $a, b = $b, c =$c")

    //try re-assigning value
    //b = 4
    println("b = $b")
}