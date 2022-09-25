package com.example.chalangechapterfour

class Controller (private val callback: Callback){
    fun bindingAp(value1: Int, value2 :Int){
        val result = value1 + value2
        callback.tampilkanHasil(result.toString())
    }
}