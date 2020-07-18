package com.tgt.kotlin.collections

fun main() {
    var immutableMap = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four", 5 to "Five")

      //Try adding element
     // immutableMap.put(4. "four")

    for (key in immutableMap.keys) {
        println("$key = ${immutableMap[key]}")
    }
}