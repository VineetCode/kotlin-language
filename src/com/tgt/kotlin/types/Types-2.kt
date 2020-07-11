package com.tgt.kotlin.types

fun main() {
    //can we do this?
   // var a : String ="abc"
   // a = null

    //How to store null
    var b : String? = "abc"
    b = null
    println(b)

    //Safe calls
    val c = "Kotlin"
    val d : String ? = null
    println(c?.length)
    println(d?.length)

    println("============Safe Call Operator to print only non-null values==================")
    //Safe Call Operator to print only non-null values
    val listWithNulls : List<String?> = listOf("Target", null, "Minneapolis")
    for(item in listWithNulls) {
        item?.let { println(it) }
    }

    //Elvis Operator

    println("-------Elvis Operator------")
    var e : String? ="abc"
    e = null
    val l1 : Int = if (e != null)
                       e.length
                   else -1
    val l2 : Int = e?.length ?: -1

    println("l1 = $l1")
    println("l2 = $l2")
    println("-------Not-Null Assertion Operator------")
    //Not-Null Assertion Operator
    var f : String? = "abc"
    f = null
   // println(f!!.length)

    //Safe Cast
    println("-------Safe Cast ----------------")
    val g : String  =  "abc"
    val h : Int? = g as? Int
    println(h)

   //Filter a Collection of Nullable type
    println("------------Filter a Collection of Nullable type-------------")
    val nullableList : List<Int?> = listOf(1, 2, null, 4)
    val inList : List<Int>  = nullableList.filterNotNull()
    println(inList)

}