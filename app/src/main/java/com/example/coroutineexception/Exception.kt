package com.example.coroutineexception

import kotlinx.coroutines.*

fun main() = runBlocking {
    val obj = Exception()
    val job = GlobalScope.launch(obj.exceptionHandler) {
        throw IndexOutOfBoundsException()
    }
    job.join()
    println("Joined failed job")
    val deferred = GlobalScope.async {
        println("Throwing exception from async")
        throw ArithmeticException()
    }
    try {
        deferred.await()
        println("Unreached")
    } catch (e: ArithmeticException) {
        println("Caught ArithmeticException")
    }
}
class Exception {
     val exceptionHandler = CoroutineExceptionHandler {
            coroutineContext, throwable ->
        println("throwing exception from launch")
    }
}