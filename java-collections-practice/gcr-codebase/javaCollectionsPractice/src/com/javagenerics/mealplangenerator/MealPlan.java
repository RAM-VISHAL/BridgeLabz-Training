package com.javagenerics.mealplangenerator;

interface MealPlan {
    String getMealType();
    boolean isValid();
    void showPlan();
}