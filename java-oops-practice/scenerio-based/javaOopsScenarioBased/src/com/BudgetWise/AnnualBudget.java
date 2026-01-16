package com.BudgetWise;

import java.util.Map;

public class AnnualBudget extends Budget {

    private int year;

    public AnnualBudget(int year, double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
        this.year = year;
    }

    @Override
    public void generateReport() {
        System.out.println("📈 Annual Budget Report - " + year);
        System.out.println("Total Income: ₹" + income);
        System.out.println("Annual Savings: ₹" + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Overspending Check (Yearly):");

        for (String category : categoryLimits.keySet()) {
            double spent = 0;

            for (Transaction t : transactions) {
                if (t.getCategory().equals(category)
                        && t.getType().equalsIgnoreCase("EXPENSE")) {
                    spent += t.getAmount();
                }
            }

            if (spent > categoryLimits.get(category) * 12) {
                System.out.println("⚠ Annual overspend in " + category);
            }
        }
    }
}
