package com.sorting.quicksort.cropmonitor;

class SensorData {

    private long timestamp;     // time in milliseconds
    private double temperature;

    public SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getTemperature() {
        return temperature;
    }
}
