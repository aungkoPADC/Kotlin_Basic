package com.padcmyanmar.kotlinbasic.java;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (!name.equals("")){
            this.name = name;
        }
    }

}
