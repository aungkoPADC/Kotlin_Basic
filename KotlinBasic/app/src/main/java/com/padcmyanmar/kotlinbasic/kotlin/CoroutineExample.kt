package com.padcmyanmar.kotlinbasic.kotlin

import kotlinx.coroutines.*
import kotlin.concurrent.thread

//Reference from https://kotlinlang.org/docs/reference

//fun main() {
//
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//        println("World!") // print after delay
//    }
//    println("Hello,") // main thread continues while coroutine is delayed
//    Thread.sleep(100L) // block main thread for 2 seconds to keep JVM alive
//}

//fun main() {
//
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,") // main thread continues here immediately
//    runBlocking {     // but this expression blocks the main thread
//        delay(5000L)  // ... while we delay for 2 seconds to keep JVM alive
//    }
//
//    print("over.")
//}

//fun doJob() = runBlocking { // start main coroutine
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,") // main coroutine continues here immediately
//    delay(2000L)      // delaying for 2 seconds to keep JVM alive
//}
//
//fun main(){
//    doJob()
//}
