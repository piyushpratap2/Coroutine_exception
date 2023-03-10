package com.example.coroutineexception

fun main(){
    val obj = Example("Piyush")
    var age:Int
    obj.setPersonAge(20)
    age = obj.getPersonAge()

    obj.getName()
    println("Age is: $age")


}

class Example(_name:String): OOPS(_name) {
    override var age: Int =0

    override fun setPersonAge(_age: Int) {
        age = _age
    }

    override fun getPersonAge(): Int {
        return age
    }
}