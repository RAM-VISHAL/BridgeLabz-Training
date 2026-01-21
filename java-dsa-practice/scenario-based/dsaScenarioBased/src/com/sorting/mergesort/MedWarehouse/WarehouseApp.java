package com.sorting.mergesort.MedWarehouse;

public class WarehouseApp {

    public static void main(String[] args) {

        Medicine[] medicines = {
            new Medicine(201, 30),
            new Medicine(202, 7),
            new Medicine(203, 15),
            new Medicine(204, 3)
        };

        MergeSorter.mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("Medicines sorted by expiry date:");

        for (Medicine m : medicines) {
            System.out.println(
                "Medicine ID: " + m.getId() +
                " | Expiry in: " + m.getExpiryDays() + " days"
            );
        }
    }
}
