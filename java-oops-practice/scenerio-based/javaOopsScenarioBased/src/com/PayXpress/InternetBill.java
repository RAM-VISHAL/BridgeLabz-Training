package com.PayXpress;

class InternetBill extends Bill {

    public InternetBill(double amount) {
        super("Internet", amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Internet Bill Reminder: Service may be suspended.");
    }
}
