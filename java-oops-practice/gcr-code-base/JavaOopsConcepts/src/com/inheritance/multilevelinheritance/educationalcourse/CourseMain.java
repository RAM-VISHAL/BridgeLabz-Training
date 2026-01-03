package com.inheritance.multilevelinheritance.educationalcourse;

public class CourseMain {
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Coursera",
                true,
                10000,
                20
        );

        course.displayDetails();
    }
}