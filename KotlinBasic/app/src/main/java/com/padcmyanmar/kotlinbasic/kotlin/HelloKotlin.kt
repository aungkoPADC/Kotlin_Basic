package com.padcmyanmar.kotlinbasic.kotlin

lateinit var value3 :String

fun main() {
    print("Hello Kotlin")

    val value = "Read only"
//    value = "Write" Error

    var value2 = "Read and Write"
    value2 = "Assign"

    value3="Assign me"
    print(value3)

    val person = Person()
    val person2 = Person(name = "Aung Aung")
//    person.name = ""
}