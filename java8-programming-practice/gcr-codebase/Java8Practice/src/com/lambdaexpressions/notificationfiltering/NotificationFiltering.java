package com.lambdaexpressions.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("EMERGENCY", "Heart rate critical"),
            new Alert("MEDICATION", "Take insulin"),
            new Alert("APPOINTMENT", "Doctor visit at 5 PM"),
            new Alert("EMERGENCY", "Blood pressure high")
        );

        // User preference: Only emergency alerts
        Predicate<Alert> emergencyOnly =
            alert -> alert.type.equalsIgnoreCase("EMERGENCY");

        // Filter and display alerts
        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}
