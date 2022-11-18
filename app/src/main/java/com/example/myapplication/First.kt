package com.example.myapplication

import java.util.Scanner

fun myMul(a:Int, b:Int): Int {
        return a*b
    }

    fun myAdd(a:Int, b:Int): Int{
            return a+b
    }

    fun myname(){
        println("My name is Aravindh!")
    }

    fun myHigherOrder(anyfun : () -> Unit) : (Int, Int) -> Int{
        anyfun()
        return ::myAdd
    }

var myLambda = {a: Int, b:Int ->
    println("This is Lambda Function")
    a+b
}

var checkFilter = {a: Int ->
    var b = a * 2
    println("Checking $a and $b")
    b%2==0
}

var checkMap = {a: Int ->
    println("Got $a")
    a*10
}

fun main(){

    val reader = Scanner(System.`in`)

    try{

        try{
            var name:String = reader.nextLine()
            if(name.length==0) {
                throw Exception("Null Value  Not Allowed")
            }
            else{
                println("Hi $name")
            }
        }
        catch (e : Exception){
            println("Enter Valid Name $e")
        }

        try{
            try{
                var phoneNo : String? = reader.nextLine()!!
                if(phoneNo?.length==0){
                    throw java.lang.NullPointerException("Null Value Not Allowed!!")
                }
                if(phoneNo!!.length > 10){
                    throw java.lang.Exception("Length Greater than 10")
                }
                println("We will Call You @$phoneNo")
            }
            catch(e:java.lang.NullPointerException){
                print("Enter Valid Phone Number $e")
            }
            catch (e: java.lang.Exception){
                println("Exception $e")
            }
        }
        catch(e: Exception){
            println("Exception $e")
        }

    }
    catch (e : java.lang.Exception){
        println("Exception $e")
    }






}