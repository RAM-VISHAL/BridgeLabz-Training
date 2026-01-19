package com.sorting.mergesort.fleetmanager;

class FleetManager {

    public static void mergeSort(Vehicle[] vehicles) {

        if (vehicles.length < 2)
            return;

        int mid = vehicles.length / 2;

        Vehicle[] left = new Vehicle[mid];
        Vehicle[] right = new Vehicle[vehicles.length - mid];

        for (int i = 0; i < mid; i++)
            left[i] = vehicles[i];

        for (int i = mid; i < vehicles.length; i++)
            right[i - mid] = vehicles[i];

        mergeSort(left);
        mergeSort(right);

        merge(vehicles, left, right);
    }

    private static void merge(Vehicle[] result,
                              Vehicle[] left,
                              Vehicle[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if (left[i].getMileage() <= right[j].getMileage()) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }
}
