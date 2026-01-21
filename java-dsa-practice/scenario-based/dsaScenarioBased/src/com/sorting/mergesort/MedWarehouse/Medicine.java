package com.sorting.mergesort.MedWarehouse;

public class Medicine {

    private int id;
    private int expiryDays;

    public Medicine(int id, int expiryDays) {
        this.id = id;
        this.expiryDays = expiryDays;
    }

    public int getId() {
        return id;
    }

    public int getExpiryDays() {
        return expiryDays;
    }
}
