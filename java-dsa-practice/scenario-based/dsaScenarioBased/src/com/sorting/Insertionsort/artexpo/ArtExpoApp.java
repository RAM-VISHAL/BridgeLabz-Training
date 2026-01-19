package com.sorting.Insertionsort.artexpo;

public class ArtExpoApp {

    public static void main(String[] args) {

        Artist[] registrations = {
                new Artist("Ravi", 1709003200),
                new Artist("Meera", 1709001100),
                new Artist("Arjun", 1709002500),
                new Artist("Kavya", 1709001800),
                new Artist("Neha", 1709004000)
        };

        ArtExpoManager.insertionSort(registrations);

        System.out.println("🎨 Artist Booth Assignment Order:");

        for (Artist a : registrations) {
            System.out.println(
                a.getName() + " → " + a.getRegistrationTime()
            );
        }
    }
}
