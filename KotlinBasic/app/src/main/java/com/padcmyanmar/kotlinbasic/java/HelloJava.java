package com.padcmyanmar.kotlinbasic.java;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        final String value = "Read only";
//        value = "Write";  => Error


        String value2 = "Read and Write";
        value2 = "Assign";

        new Person().getName();
//        new Person().setName("");
    }
}
