package com.example.coroutineexception

abstract class OOPS(var _name:String) {
    var name:String
    init{
        this.name = _name
    }

    abstract var age:Int

    abstract fun setPersonAge(_age:Int)

    abstract fun getPersonAge():Int


     fun getName(){
        println("name: $name")
    }
}