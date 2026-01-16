package com.BudgetWise;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);
        limits.put("Shopping", 2000.0);

        Budget budget = new MonthlyBudget("January", 30000, limits);

        budget.addTransaction(new Transaction(4000, "EXPENSE",
                LocalDate.now(), "Food"));
        budget.addTransaction(new Transaction(3500, "EXPENSE",
                LocalDate.now(), "Travel"));
        budget.addTransaction(new Transaction(2000, "EXPENSE",
                LocalDate.now(), "Shopping"));

        budget.generateReport();      // polymorphism
        budget.detectOverspend();     // polymorphism
    }
}
