package com.HomeNest;

public class HomeNestApp {

    public static void main(String[] args) {

        Device[] devices = {
            new Light("L-101"),
            new Camera("C-201"),
            new Thermostat("T-301"),
            new Lock("K-401")
        };

        for (Device d : devices) {
            d.turnOn();
            d.reset();   // polymorphism
            System.out.println("Energy Used: " + d.getEnergyUsage());
            System.out.println("------------------------");
        }
    }
}
