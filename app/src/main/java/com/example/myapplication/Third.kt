package com.example.myapplication

import kotlin.concurrent.thread

class MyClass{

     lateinit var name:String
     fun makeSomeNoise(){
         name = "Jo"
         println("Ha.. Hahahahahahahahaha... $name")
     }

 }

fun main(){

    println("Thread ${Thread.currentThread().name} is started")

    thread {
        println("Thread ${Thread.currentThread().name} started")
        Thread.sleep(200)
        println("Thread ${Thread.currentThread().name} ended")
    }

    println("Thread ${Thread.currentThread().name} is ended!")

}