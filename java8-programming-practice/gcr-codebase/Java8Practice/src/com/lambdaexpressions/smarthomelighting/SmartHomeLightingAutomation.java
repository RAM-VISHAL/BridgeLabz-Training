package com.lambdaexpressions.smarthomelighting;

public class SmartHomeLightingAutomation {

    public static void main(String[] args) {

        SmartLight light = new SmartLight();

        // Motion detected
        light.runLight(() -> 
            System.out.println("Motion detected → Turning ON bright white lights")
        );

        // Night time
        light.runLight(() -> 
            System.out.println("Night time → Switching to dim warm lights")
        );

        // Voice command
        light.runLight(() -> 
            System.out.println("Voice command → Changing lights to blue ambience")
        );
    }
}
