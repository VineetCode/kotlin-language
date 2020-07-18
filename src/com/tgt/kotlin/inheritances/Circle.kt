package com.tgt.kotlin.inheritances

open class Shape {

    fun draw() {
        println("Draw Shape")
    }

    open fun printName() {
        println("Shape")
    }

    fun fill() {
        println("Fill Shape")
    }
}

class Circle : Shape() {
     override fun printName() {
        println("Circle")
    }
}

fun main() {
    val shape : Shape = Circle()
    shape.draw()
    shape.printName()
    shape.fill()
}