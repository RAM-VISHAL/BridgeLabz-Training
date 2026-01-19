package com.sorting.mergesort.fleetmanager;

public class FleetManagerApp {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle("VH101", 120000),
                new Vehicle("VH102", 45000),
                new Vehicle("VH103", 98000),
                new Vehicle("VH104", 30000),
                new Vehicle("VH105", 76000),
                new Vehicle("VH106", 150000)
        };

        FleetManager.mergeSort(vehicles);

        System.out.println("🚚 Master Maintenance Schedule (by Mileage):");

        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleId() +
                    " → " + v.getMileage() + " km");
        }
    }
}
