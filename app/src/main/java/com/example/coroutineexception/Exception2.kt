package com.example.coroutineexception

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun main(){
    val obj = Exception2()
    val time = measureTimeMillis {
       val job =  coroutineScope {
            launch { obj.firstjob() }
            launch{obj.secondjob() }
            launch{obj.thirdjob()}
           /*obj.firstjob()
           obj.secondjob()
           obj.thirdjob()*/
        }

    }
    println{"$time"}
}
class Exception2{
    suspend fun firstjob(){
        delay(1000)
        println("first job")
    }

    suspend fun secondjob(){
        delay(1000)
        println("second job")
    }

    suspend fun thirdjob(){
        delay(1000)
        println("third job")
    }
}
