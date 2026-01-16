package com.ExamCell;

public class Student {
    private int rollNo;
    private String name;
    private int score;

    public Student(int rollNo, String name, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " : " + score;
    }
}
