package com.PayXpress;

public class PayXpressApp {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200);
        Bill water = new WaterBill(450);
        Bill internet = new InternetBill(999);

        // Polymorphism
        electricity.sendReminder();
        water.sendReminder();
        internet.sendReminder();

        System.out.println();

        electricity.pay();
        water.pay();

        System.out.println();

        double lateAmount = internet.calculateLateFee(100);
        System.out.println("Internet bill with late fee: ₹" + lateAmount);
    }
}
