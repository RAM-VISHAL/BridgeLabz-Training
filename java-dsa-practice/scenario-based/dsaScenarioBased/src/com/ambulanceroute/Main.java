package com.ambulanceroute;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        route.displayUnits();

        route.setAvailability("Emergency", false);
        route.setAvailability("Radiology", false);

        route.routePatient();   // Should go to Surgery

        route.removeUnit("Radiology");

        route.displayUnits();

        route.routePatient();
    }
}
