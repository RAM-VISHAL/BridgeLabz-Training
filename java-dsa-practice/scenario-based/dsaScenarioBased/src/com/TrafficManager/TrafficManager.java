package com.TrafficManager;

public class TrafficManager {
    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        WaitingQueue queue = new WaitingQueue(3);

        queue.enqueue("Car-A");
        queue.enqueue("Car-B");
        queue.enqueue("Car-C");
        queue.enqueue("Car-D");   // Overflow

        roundabout.addVehicle(queue.dequeue());
        roundabout.addVehicle(queue.dequeue());
        roundabout.printRoundabout();

        roundabout.removeVehicle("Car-A");
        roundabout.printRoundabout();

        roundabout.addVehicle(queue.dequeue());
        roundabout.printRoundabout();

        queue.dequeue(); // Underflow
    }
}
