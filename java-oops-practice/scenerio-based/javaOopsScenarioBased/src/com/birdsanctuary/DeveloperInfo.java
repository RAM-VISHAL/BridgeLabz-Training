package com.birdsanctuary;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CLASS)
public @interface DeveloperInfo {
    String developer();
    String version();
}
