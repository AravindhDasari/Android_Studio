package com.example.myapplication

class Tiger(name :String = "Aravind"){

    var myName : String
    init {
        myName = name
        println("Primary Constructor")
    }

    constructor(city: String, age: Int): this(city){
        println("City name is $city")
    }
    var legs = 4

    fun tigerRoaring(){
        println("Tiger is Roaring")
        println("Tiger name is $myName")
    }
}

fun main(){
    var tiger = Tiger("Hyd",22)
    tiger.tigerRoaring()
}