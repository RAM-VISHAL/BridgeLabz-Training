package com.fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 8;  // higher burn
        return caloriesBurned;
    }
}