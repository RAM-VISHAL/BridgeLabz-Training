package com.BudgetWise;

import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, Map<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Controlled expense entry
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Operator usage for savings calculation
    public double calculateNetSavings() {
        double totalExpenses = 0;

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                totalExpenses += t.getAmount();
            }
        }
        return income - totalExpenses; // operator usage
    }
}
