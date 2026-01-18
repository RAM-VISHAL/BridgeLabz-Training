package com.PayXpress;

import java.time.LocalDate;

class Bill implements IPayable {

    private String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    // Constructor for one-time bill
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Constructor for recurring bills
    public Bill(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dueDate = LocalDate.now().plusMonths(1);
        this.isPaid = false;
    }

    // Encapsulation: no direct access to payment status
    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    // Operator usage: late fee calculation
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    @Override
    public void pay() {
        if (!isPaid) {
            markAsPaid();
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println(type + " bill already paid.");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Your " + type + " bill is due on " + dueDate);
    }
}
