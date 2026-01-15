package com.TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

class WaitingQueue {
    Queue<String> queue;
    int capacity;

    public WaitingQueue(int capacity) {
        this.capacity = capacity;
        queue = new LinkedList<>();
    }

    public void enqueue(String vehicle) {
        if (queue.size() == capacity) {
            System.out.println("⚠ Queue Overflow! " + vehicle + " cannot enter.");
        } else {
            queue.add(vehicle);
            System.out.println(vehicle + " added to waiting queue.");
        }
    }

    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("⚠ Queue Underflow! No vehicles waiting.");
            return null;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

