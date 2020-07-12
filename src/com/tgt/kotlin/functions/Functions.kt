package com.tgt.kotlin.functions

fun main() {
    //Functions call
    var sum = add(2,4)
    println("add : $sum")

    //Function with default parameter
    sum = addWithDefault(50)
    println("addWIthDefault() : $sum")

    sum = addWithDefault2(y=5)
    println("addWithDefault2 :: $sum")

    //Functions returning Unit type
    display("Target")

    //vararg function
    val list = asList(-1, 0, 100, 200, 300, 4)
    println("vararg functions ::: $list")

    val values = arrayOf(100, 200, 300)
    val list2 = asList(-1, 0, *values, 4)
    println("pointer concept :: $list2")
}

fun add(x:Int, y:Int) :Int {
    return (x + y)
}

fun addWithDefault(x:Int, y:Int =30) :Int {
    return (x + y)
}

fun addWithDefault2(x:Int = 20, y: Int) :Int {
    return (x + y)
}

fun display(name : String) :Unit {
    println("Hello, $name")
}

fun<T> asList(vararg ts : T):List<T> {
    val result = ArrayList<T>()
    for(t in ts) {
        result.add(t)
    }
    return result
}