package com.CallCenter;

public class Main {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.receiveCall(new Customer("Ravi", false));
        center.receiveCall(new Customer("Anita", true));
        center.receiveCall(new Customer("Ravi", false));
        center.receiveCall(new Customer("Karan", true));
        center.receiveCall(new Customer("Meena", false));

        System.out.println("\nProcessing Calls:");
        center.handleCall();
        center.handleCall();
        center.handleCall();
        center.handleCall();
        center.handleCall();

        center.showCallStats();
    }
}
