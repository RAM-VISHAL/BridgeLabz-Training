package com.ambulanceroute;

public class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    public HospitalUnit(String name) {
        this.name = name;
        this.available = true;
        this.next = null;
    }
}
