package com.tgt.kotlin.collections

fun main(){
    val immutableList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Try add another element; Compilation Error
    //immutableList.add =11

    for(x in immutableList){
       // println(2 * x)
    }
    
    immutableList.forEachIndexed {
            index, element -> println("2 x $index = ${element * 2}")
    }
}