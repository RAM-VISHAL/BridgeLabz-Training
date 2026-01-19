package com.sorting.mergesort.fleetmanager;

class Vehicle {

    private String vehicleId;
    private int mileage;

    public Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public int getMileage() {
        return mileage;
    }
}
