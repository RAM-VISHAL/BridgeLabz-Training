package com.annotation.todoannotation;

class ProjectService {

    @Todo(
        task = "Implement payment gateway",
        assignedTo = "Ramvishal",
        priority = "HIGH"
    )
    public void paymentModule() {
        
    }

    @Todo(
        task = "Add email notifications",
        assignedTo = "Rahul"
    )
    public void notificationModule() {
        
    }

    public void completedModule() {
        System.out.println("This module is completed");
    }
}