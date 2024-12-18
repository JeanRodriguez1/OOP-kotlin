package com.example.oop_kotlin

class Person(var name: String = "Anonimo", var passport: String? = null) {
    var alive: Boolean = true

    fun Person(){
        name = "Juan"
        passport = "B1123345"
    }

    fun die(){
        alive = false
    }

}