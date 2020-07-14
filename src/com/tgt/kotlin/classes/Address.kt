package com.tgt.kotlin.classes

class Address(private var name : String,
              private var state: String? = "KA",
              private var zip : String) {

    //The constuctor parameters act as the properties; Concise way of declaring

     val isNameEmpty: Boolean
          get() = this.name.isEmpty()

     var city: String =""
          get() = field
          set(value) {
              field = value
              //this.state = "Some state with city $value"
          }
     var stringRepresentation: String = ""
             get() ="Name : $name | City : $city | State : $state | Zip : $zip"
             private set
      }

fun main() {
    var myAddress = Address(name = "Singh, Vineet", zip="560037")
    myAddress.city = "Bangalore"
    println(myAddress.stringRepresentation)
}