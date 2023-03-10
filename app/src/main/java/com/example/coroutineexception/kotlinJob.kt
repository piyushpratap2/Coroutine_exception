package com.example.coroutineexception

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(){
    val obj = kotlinJob()
    obj.second()
}
 open class kotlinJob {
    suspend fun second(){
        val parentjob = GlobalScope.launch(Dispatchers.IO) {
            println("parent started")

            val childjob = launch(Dispatchers.IO){
                println("child job started")
                delay(5000)
                println("child job ended")
            }
            delay(3000)
            println("parent job ended")
        }
        parentjob.join()
        println("parent job completed")
    }

}