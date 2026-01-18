package com.birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String id, String name) {
        super(id, name, "Seagull");
    }

    public void fly() {
        System.out.println(getName() + " flies near the sea.");
    }

    public void swim() {
        System.out.println(getName() + " floats on water.");
    }
}
