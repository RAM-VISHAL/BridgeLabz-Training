package com.fittrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 5;  // moderate burn
        return caloriesBurned;
    }
}