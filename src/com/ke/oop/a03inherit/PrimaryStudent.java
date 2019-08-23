package com.ke.oop.a03inherit;

public class PrimaryStudent extends Student {
    private int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
