
package com.sorting.Insertionsort.robowarehouse;

class RoboWarehouse {

    public static void insertionSort(Package[] packages) {

        for (int i = 1; i < packages.length; i++) {

            Package key = packages[i];
            int j = i - 1;

            // Shift heavier packages right
            while (j >= 0 && packages[j].getWeight() > key.getWeight()) {
                packages[j + 1] = packages[j];
                j--;
            }

            packages[j + 1] = key;
        }
    }
}
