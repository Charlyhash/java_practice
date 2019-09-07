package com.ke.reflection;

class Student extends Person{
    public Student(String name) {
        super(name);
    }

    public int getScore(String type) {
        return 99;
    }

    public int getGrade(int year) {
        return 1;
    }
    public void hello() {
        System.out.println("Student:hello");
    }

    public int score;
    private int grade;
}
