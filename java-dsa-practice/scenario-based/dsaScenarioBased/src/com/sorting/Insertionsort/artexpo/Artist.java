package com.sorting.Insertionsort.artexpo;

class Artist {

    private String name;
    private long registrationTime; // timestamp

    public Artist(String name, long registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public String getName() {
        return name;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
}
