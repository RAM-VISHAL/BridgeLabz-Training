package com.PayXpress;

class WaterBill extends Bill {

    public WaterBill(double amount) {
        super("Water", amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Water Bill Reminder: Pay before due date to avoid fines.");
    }
}
