package com.PayXpress;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount) {
        super("Electricity", amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Electricity Bill Reminder: Avoid power disconnection!");
    }
}
