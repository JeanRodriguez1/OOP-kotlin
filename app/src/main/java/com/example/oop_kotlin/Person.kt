package com.example.oop_kotlin

class Person(var name: String, var passport: String?) {
    var alive: Boolean = true

    fun die(){
        alive = false
    }

}