package com.annotation.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Method method = SoftwareFix.class.getMethod("process");

        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugReports) {
            System.out.println("Bug: " + bug.description());
        }
    }
}