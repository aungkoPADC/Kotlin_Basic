package com.padcmyanmar.kotlinbasic.kotlin

class Person{

    var name:String="Aung Aung"
    private set(value) {
        if (value.isNotEmpty()){
            field = value
        }
    }
}