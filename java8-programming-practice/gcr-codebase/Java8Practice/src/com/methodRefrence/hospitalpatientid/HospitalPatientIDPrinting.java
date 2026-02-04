package com.methodRefrence.hospitalpatientid;

import java.util.*;

public class HospitalPatientIDPrinting {

    public static void main(String[] args) {

        List<String> patientIds = Arrays.asList(
            "PID1001", "PID1002", "PID1003", "PID1004"
        );

        // Method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}
