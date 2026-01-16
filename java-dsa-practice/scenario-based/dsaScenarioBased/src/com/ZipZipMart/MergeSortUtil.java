package com.ZipZipMart;

import java.util.List;
import java.util.ArrayList;

public class MergeSortUtil {

    // Public function to start merge sort
    public static void mergeSort(List<SalesRecord> records) {
        if (records.size() <= 1) return;

        int mid = records.size() / 2;

        List<SalesRecord> left = new ArrayList<>(records.subList(0, mid));
        List<SalesRecord> right = new ArrayList<>(records.subList(mid, records.size()));

        mergeSort(left);
        mergeSort(right);

        merge(records, left, right);
    }

    // Stable merge function
    private static void merge(List<SalesRecord> result,
                              List<SalesRecord> left,
                              List<SalesRecord> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            // Sort by date first, then by amount
            if (left.get(i).getDate().isBefore(right.get(j).getDate()) ||
               (left.get(i).getDate().isEqual(right.get(j).getDate()) &&
                left.get(i).getAmount() <= right.get(j).getAmount())) {

                result.set(k++, left.get(i++)); // stability preserved
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

