package com.rachel

fun main(args: Array<String>) {
//    println("Hello Kotlin");
//    PersonK().hello();
    val h = PersonK();
    h.hello();
    // test
}

class PersonK{
    fun hello(){
        println("Hello Kotlin in PersonK");
    }
}