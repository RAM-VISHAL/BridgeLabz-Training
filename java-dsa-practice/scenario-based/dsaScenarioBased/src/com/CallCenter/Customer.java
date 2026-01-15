package com.CallCenter;

class Customer {
    String name;
    boolean isVIP;
    long callTime;

    Customer(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
        this.callTime = System.currentTimeMillis();
    }
}
