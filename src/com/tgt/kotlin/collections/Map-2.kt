package com.tgt.kotlin.collections

fun main() {
     var mutableMap = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")

    //Try adding element
    mutableMap.put(4, "Four")
    mutableMap[5] = "Five"
    mutableMap[10] = "Ten"

    for (key in mutableMap.keys) {
        println("$key = ${mutableMap[key]}")
    }

    for (value in mutableMap.values) {
        println("$value")
    }
}