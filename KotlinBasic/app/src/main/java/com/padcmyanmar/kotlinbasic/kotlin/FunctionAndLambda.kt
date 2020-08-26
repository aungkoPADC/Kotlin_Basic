package com.padcmyanmar.kotlinbasic.kotlin

val numberList = listOf(1, 2, 3, 4, 5)

var calculate: (num1: Int, num2: Int, operator: Char) -> Int = { num1, num2, operator -> 0 }

fun numberListCalculator(
    numList: List<Int>,
    operator: Char,
    calculate: (num1: Int, num2: Int, operator: Char) -> Int
): Int {

    var initialValue = 0

    for (number in numList) {
        initialValue = calculate(initialValue, number, operator)
    }

    return initialValue
}

fun main() {

//    val result = numberListCalculator(
//        numList = numberList,
//        operator = '/',
//        calculate = { num1, num2, operator ->
//
//            when (operator) {
//                '+' -> num1 + num2
//                '-' -> num1 - num2
//                '*' -> num1 * num2
//                '/' -> num1 / num2
//                else -> 0
//            }
//        })
//
//    print("Result is $result")

    val result = numberListCalculator(
        numList = numberList,
        operator = '/'
    ) { num1, num2, operator ->

        when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> 0
        }
    }

    print("Result is $result")

    "aa".let { output->
        print(output)
    }

//    calculate = { num1, num2, operator ->
//        when (operator) {
//            '+' -> num1 + num2
//            '-' -> num1 - num2
//            '*' -> num1 * num2
//            '/' -> num1 / num2
//            else -> 0
//        }
//    }
//
//    val result = numberListCalculator(
//        numList = numberList,
//        operator = '+',
//        calculate = calculate
//    )
//
//    print("Result is $result")


}