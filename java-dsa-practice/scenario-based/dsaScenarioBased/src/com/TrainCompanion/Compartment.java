package com.TrainCompanion;

public class Compartment {
    String name;
    boolean hasPantry;
    boolean hasWiFi;
    Compartment prev;
    Compartment next;

    public Compartment(String name, boolean pantry, boolean wifi) {
        this.name = name;
        this.hasPantry = pantry;
        this.hasWiFi = wifi;
    }

    @Override
    public String toString() {
        return name + " [Pantry: " + hasPantry + ", WiFi: " + hasWiFi + "]";
    }
}
