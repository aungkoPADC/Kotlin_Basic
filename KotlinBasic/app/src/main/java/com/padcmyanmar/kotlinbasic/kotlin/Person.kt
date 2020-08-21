package com.padcmyanmar.kotlinbasic.kotlin

class Person{


    companion object{

        val email:String?=null

        fun getPersonInfo(){

            //1
            if (email!=null){
                //null safe
            }

            //2
            email?.let {
                //null safe
            }

            val data = email ?: ""
            
        }
    }
}