package com.example.interfax

import android.util.Log

class Inter {

    fun showcase1(){

    }
    fun showcases2(){

    }
    fun showCAses(){
        showcase1()
        showcases2()
    }
    interface interface1{
        fun metdABSTRACTO()
        fun mtdwithCOMPILETATION(){

        }

    }
    interface  interface2{
        var propietaAbstract:Int
        var propertieWithImplements :String
        get() = "bydefault"
            set(value) {this.propertieWithImplements=value}
        fun hello(){
            Log.w("inteface-2","is it working $propertieWithImplements?,yay!  $propietaAbstract  :=) ")
        }

    }


}