package com.fittrack;

class Workout implements ITrackable {
    protected String type;
    protected int duration;            // in minutes
    protected double caloriesBurned;

    private String[] workoutLogs;       // internal logs (restricted)

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.workoutLogs = new String[5];
    }

    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }

    public double calculateCalories() {
        return caloriesBurned;
    }
}
