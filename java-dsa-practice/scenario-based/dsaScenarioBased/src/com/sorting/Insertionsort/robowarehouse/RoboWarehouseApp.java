package com.sorting.Insertionsort.robowarehouse;

public class RoboWarehouseApp {

    public static void main(String[] args) {

        Package[] shelf = {
                new Package(12.5),
                new Package(8.2),
                new Package(15.0),
                new Package(10.3),
                new Package(6.8)
        };

        RoboWarehouse.insertionSort(shelf);

        System.out.println("🤖 Shelf Load Order (Light → Heavy):");

        for (Package p : shelf) {
            System.out.println(p.getWeight() + " kg");
        }
    }
}
