package com.HospitalQueue;

class Patient {
    String name;
    int criticality;   // 1 (low) to 10 (high)

    public Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    public void display() {
        System.out.println(name + "  | Criticality: " + criticality);
    }
}
