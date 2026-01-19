package com.sorting.bubblesort.Icecreamrush;

class IceCreamRush {

    public static void bubbleSort(Flavor[] flavors) {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (flavors[j].getSalesCount() < flavors[j + 1].getSalesCount()) {

                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop early if already sorted
            if (!swapped)
                break;
        }
    }
}
