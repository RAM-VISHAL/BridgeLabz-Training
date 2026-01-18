package com.birdsanctuary;

@DeveloperInfo(developer = "EcoWing Team", version = "1.0")
public abstract class Bird {

    private String id;
    private String name;
    private String species;

    public Bird(String id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void displayInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Species: " + species);
    }
}
