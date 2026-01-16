package com.BudgetWise;

import java.util.Map;

public class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(String month, double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
        this.month = month;
    }

    @Override
    public void generateReport() {
        System.out.println("📊 Monthly Budget Report - " + month);
        System.out.println("Income: ₹" + income);
        System.out.println("Net Savings: ₹" + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Overspending Check (Monthly):");

        for (String category : categoryLimits.keySet()) {
            double spent = 0;

            for (Transaction t : transactions) {
                if (t.getCategory().equals(category)
                        && t.getType().equalsIgnoreCase("EXPENSE")) {
                    spent += t.getAmount();
                }
            }

            if (spent > categoryLimits.get(category)) {
                System.out.println("⚠ " + category + " exceeded limit!");
            }
        }
    }
}
