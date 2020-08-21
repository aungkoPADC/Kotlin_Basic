package com.padcmyanmar.kotlinbasic.kotlin

fun main() {

    val age = 15

    when(age){
        1->{print("age is 1")}
        in 0..15->{
            print("under 16")
        }
        in 16..30->{
            print("under 30")
        }
        else->{
            print("over 30")
        }
    }

    println()

    val numbers = listOf(10,20,30,40,50)

    for (i in numbers){
        print("$i ")
    }

    println()

    for(i in numbers.indices){
        print("$i ")
    }

    println()

    for((index,value) in numbers.withIndex()){
        print("$index , $value ")
    }

    println()

    for (i in 0..5){
        print("$i ")
    }

    println()

    for(i in 0..10 step 2){
        print("$i ")
    }

    println()

    for(i in 10 downTo 5){
        print("$i ")
    }

}