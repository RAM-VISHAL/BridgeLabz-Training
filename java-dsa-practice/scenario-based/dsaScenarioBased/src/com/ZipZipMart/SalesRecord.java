package com.ZipZipMart;

import java.time.LocalDate;

public class SalesRecord {
    private int transactionId;
    private LocalDate date;
    private double amount;

    public SalesRecord(int transactionId, LocalDate date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "TxnID: " + transactionId +
               ", Date: " + date +
               ", Amount: ₹" + amount;
    }
}
