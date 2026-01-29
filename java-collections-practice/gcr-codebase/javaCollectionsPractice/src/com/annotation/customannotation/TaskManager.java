package com.annotation.customannotation;

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ramvishal")
    public void completeTask() {
        System.out.println("Task completed");
    }
}