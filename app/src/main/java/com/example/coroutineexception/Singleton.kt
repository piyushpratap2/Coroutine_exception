package com.example.coroutineexception

import android.content.Context
object Singleton {
   /* private var name:String?=null
    private var id:Int = 0
    fun  getInstance():Any{
        return Singleton
    }

    fun SetName(_name:String){
        this.name = _name
    }
    fun setId(_Id:Int){
        this.id = _Id
    }

    fun getName():String{
        return name.toString()
    }

    fun getId():Int{
        return id
    }
    var value:Int = 0
    @Synchronized fun counter(){
        if(val)
        value++
        println("$value")
    }

    fun getCounter():Int{
        return value
    }*/
   /* private val Instance:Singleton? = null
    fun getInstance():Singleton{
        synchronized(this){
            var instance = Instance
            if(instance==null){
                instance = Singleton()
                println("creating the instance")
            }
            return instance
        }

    }*/
    /*private val counter:Int = 0
    fun getCounter():Int{
        synchronized(this){
            var Counter = counter
            if(Counter==0){
                Counter++
                println("increasing the counter")
            }
            return counter
        }
    }*/
    var name:String = "Hello"
    val data:(Int,Int)->Int  = {x:Int,y:Int -> x+y}
    val data2 = {x:Int,y:Int ->
        var num = x*y
        println("Multiplication of two no. is $num")
    }

    val data3: (Int) -> Int = {it}



}