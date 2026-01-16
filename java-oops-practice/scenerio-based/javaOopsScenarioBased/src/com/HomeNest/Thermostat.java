package com.HomeNest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        addEnergyUsage(15);
        System.out.println("Thermostat regulating temperature");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset to default temperature");
    }
}
