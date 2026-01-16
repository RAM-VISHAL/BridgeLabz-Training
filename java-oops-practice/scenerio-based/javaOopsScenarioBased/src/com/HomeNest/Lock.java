package com.HomeNest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        addEnergyUsage(2);
        System.out.println("Door locked");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Door unlocked");
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: security keys refreshed");
    }
}
