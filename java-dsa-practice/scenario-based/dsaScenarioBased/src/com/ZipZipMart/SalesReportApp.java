package com.ZipZipMart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalesReportApp {

    public static void main(String[] args) {

        List<SalesRecord> records = new ArrayList<>();

        records.add(new SalesRecord(101, LocalDate.of(2026, 1, 10), 500));
        records.add(new SalesRecord(102, LocalDate.of(2026, 1, 8), 1200));
        records.add(new SalesRecord(103, LocalDate.of(2026, 1, 10), 300));
        records.add(new SalesRecord(104, LocalDate.of(2026, 1, 9), 900));
        records.add(new SalesRecord(105, LocalDate.of(2026, 1, 10), 300));

        System.out.println("Before Sorting:");
        records.forEach(System.out::println);

        MergeSortUtil.mergeSort(records);

        System.out.println("\nAfter Sorting (By Date & Amount):");
        records.forEach(System.out::println);
    }
}
