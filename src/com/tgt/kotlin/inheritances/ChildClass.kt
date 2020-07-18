package com.tgt.kotlin.inheritances

open class SuperClass {
   open fun printValue () {
        print("This is Super Class")
    }
}

//Inheriting the SuperClass(Using the default constructor)
class ChildClass : SuperClass() {
    override fun printValue () {
        print("This is Super Class")
    }
}

fun main(args : Array<String>) {
   val childClass = ChildClass()
    childClass.printValue()
}