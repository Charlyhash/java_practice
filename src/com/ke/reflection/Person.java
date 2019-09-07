package com.ke.reflection;

public class Person {

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }


    public void hello() {
        System.out.println("Person:hello");
    }

    public Person() {}

    public String name;
}
