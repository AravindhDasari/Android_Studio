package com.example.myapplication

import java.util.Scanner
class IsLeap(var year:Int){
    fun check():Boolean{
        if((year%400==0) || (year%100!=0) && (year%4==0)){
            return true
        }
        else
            return false
    }
}
fun main(){
    var sc=Scanner(System.`in`)
    var year=sc.nextInt()
    if (IsLeap(year).check())
        println("$year is leap year")
    else
        println("$year is non leap year")
}