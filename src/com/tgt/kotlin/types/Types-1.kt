package com.tgt.kotlin.types

fun main(){
    //Integer Numbers
    val one = 1 //Int
    val threeBillion = 3000000000 //Long
    val oneLong = 1L //1Long
    val oneByte : Byte = 1

    println("type ${one::class} value $one")
    println("type ${threeBillion::class} value $threeBillion")
    println("type ${oneLong::class} value $oneLong")
    println("type ${oneByte::class} value $oneByte")

    println()

    //Floating-point Numbers
    val pi = 3.14 //Double
    val e = 2.7182818284  //Double
    val eFloat =  2.7182818284f //Float, actual value is 2.7181827

    println("type: ${pi::class} value $pi")
    println("type: ${e::class} value $e")
    println("type: ${eFloat::class} value $eFloat")

    //Character
    val f : Char
    f = 'a'
    println(f)

    //String
    val str ="abcd"
    for(c in str) {
        println(c)
    }

    val  s = "abc" + 1
    println(s + "def")

    //Escaped String
    val t = "Hello World!\n"
    println(t)

    //Raw String
    val text ="""
        for(c in "foo")
         println(c)
    """
    println(text)
    println(text.trimMargin())

    //String Template
    val i = 10
    println("i = $i")

    val j = "abc"
    println("$j.length is ${j.length}")

    //Boolean
    val g = false
    println(g::class)

    //Arrays
    val asc = Array(size = 5) {i -> (i * i).toString()}
    asc.forEach { println(it) }


    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x[0])

    //Nullable
    val h : Int?
    h = null
    println(h)
    //println(h!!::class)

}