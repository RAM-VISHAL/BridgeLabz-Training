package com.sorting.bubblesort.Icecreamrush;

public class IceCreamRushApp {

    public static void main(String[] args) {

        Flavor[] flavors = {
                new Flavor("Vanilla", 120),
                new Flavor("Chocolate", 180),
                new Flavor("Strawberry", 95),
                new Flavor("Mango", 160),
                new Flavor("Butterscotch", 140),
                new Flavor("Blueberry", 70),
                new Flavor("Pista", 110),
                new Flavor("Coffee", 130)
        };

        IceCreamRush.bubbleSort(flavors);

        System.out.println("🍦 Weekly Flavor Popularity Ranking:");

        for (Flavor f : flavors) {
            System.out.println(f.getName() + " → " + f.getSalesCount() + " sales");
        }
    }
}
