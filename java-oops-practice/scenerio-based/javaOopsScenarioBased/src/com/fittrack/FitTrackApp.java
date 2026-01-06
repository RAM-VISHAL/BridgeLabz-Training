package com.fittrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Rahul", 25, 72.5, "Weight Loss");

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        double cardioCalories = cardio.calculateCalories();
        cardio.stopWorkout();

        strength.startWorkout();
        double strengthCalories = strength.calculateCalories();
        strength.stopWorkout();

        double dailyTarget = 500; // calorie target
        double totalBurned = cardioCalories + strengthCalories;

        double progress = dailyTarget - totalBurned; // operator usage

        System.out.println("Calories Burned: " + totalBurned);
        System.out.println("Calories Remaining: " + progress);
    }
}