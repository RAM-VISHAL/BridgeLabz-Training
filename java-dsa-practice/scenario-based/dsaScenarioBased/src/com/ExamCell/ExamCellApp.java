package com.ExamCell;

import java.util.ArrayList;
import java.util.List;

public class ExamCellApp {

    public static void main(String[] args) {

        // Center-wise pre-sorted lists (descending score)
        List<Student> centerA = new ArrayList<>();
        centerA.add(new Student(101, "Amit", 92));
        centerA.add(new Student(102, "Neha", 85));

        List<Student> centerB = new ArrayList<>();
        centerB.add(new Student(201, "Ravi", 95));
        centerB.add(new Student(202, "Pooja", 88));

        List<Student> centerC = new ArrayList<>();
        centerC.add(new Student(301, "Kiran", 90));
        centerC.add(new Student(302, "Meena", 80));

        // Merge all centers
        List<Student> allStudents = new ArrayList<>();
        allStudents.addAll(centerA);
        allStudents.addAll(centerB);
        allStudents.addAll(centerC);

        // Sort for state-level ranking
        MergeSortRankUtil.mergeSort(allStudents);

        // Display rank list
        System.out.println("📊 State-Level Rank List");
        int rank = 1;
        for (Student s : allStudents) {
            System.out.println("Rank " + rank++ + " : " + s);
        }
    }
}
