package com.CallCenter;

import java.util.*;

public class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();

    PriorityQueue<Customer> vipQueue = new PriorityQueue<>(
        (a, b) -> Long.compare(a.callTime, b.callTime)
    );

    HashMap<String, Integer> callCount = new HashMap<>();

    // Add new call
    public void receiveCall(Customer c) {
        if (c.isVIP) {
            vipQueue.offer(c);
        } else {
            normalQueue.offer(c);
        }

        callCount.put(c.name, callCount.getOrDefault(c.name, 0) + 1);

        System.out.println("Call received from: " + c.name);
    }

    // Handle next call
    public void handleCall() {
        Customer c;

        if (!vipQueue.isEmpty()) {
            c = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            c = normalQueue.poll();
        } else {
            System.out.println("No calls waiting.");
            return;
        }

        System.out.println("Handling call from: " + c.name);
    }

    // Show call frequency
    public void showCallStats() {
        System.out.println("\nCall History:");
        for (String name : callCount.keySet()) {
            System.out.println(name + " called " + callCount.get(name) + " times");
        }
    }
}
