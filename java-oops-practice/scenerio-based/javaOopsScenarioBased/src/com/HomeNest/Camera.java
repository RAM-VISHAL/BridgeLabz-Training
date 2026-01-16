package com.HomeNest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        addEnergyUsage(10);
        System.out.println("Camera recording started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera turned off");
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: lens & memory cleared");
    }
}
