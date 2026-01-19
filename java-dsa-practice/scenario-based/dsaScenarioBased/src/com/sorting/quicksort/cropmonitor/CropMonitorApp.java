package com.sorting.quicksort.cropmonitor;

public class CropMonitorApp {

    public static void main(String[] args) {

        SensorData[] readings = {
                new SensorData(1709003200, 28.5),
                new SensorData(1709001100, 26.2),
                new SensorData(1709004500, 30.1),
                new SensorData(1709002000, 27.0),
                new SensorData(1709003800, 29.4)
        };

        CropMonitor.quickSort(readings, 0, readings.length - 1);

        System.out.println("🌱 Sorted Sensor Data (by Timestamp):");

        for (SensorData s : readings) {
            System.out.println(
                "Time: " + s.getTimestamp() +
                " | Temp: " + s.getTemperature() + "°C"
            );
        }
    }
}
