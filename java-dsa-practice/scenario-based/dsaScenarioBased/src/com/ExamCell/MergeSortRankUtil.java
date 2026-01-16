package com.ExamCell;

import java.util.List;
import java.util.ArrayList;

public class MergeSortRankUtil {

    // Entry method for sorting
    public static void mergeSort(List<Student> students) {
        if (students.size() <= 1) return;

        int mid = students.size() / 2;

        List<Student> left = new ArrayList<>(students.subList(0, mid));
        List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

        mergeSort(left);
        mergeSort(right);

        merge(students, left, right);
    }

    // Merge in descending order of score (rank list)
    private static void merge(List<Student> result,
                              List<Student> left,
                              List<Student> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            // Higher score first
            if (left.get(i).getScore() >= right.get(j).getScore()) {
                result.set(k++, left.get(i++)); // stable for equal scores
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }
}
