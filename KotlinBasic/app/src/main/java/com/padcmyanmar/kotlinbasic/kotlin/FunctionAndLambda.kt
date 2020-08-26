package com.padcmyanmar.kotlinbasic.kotlin

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
