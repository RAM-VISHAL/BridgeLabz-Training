package com.sorting.bubblesort.cinemahouse;

class Movie {

    private String name;
    private int showTime; // time in minutes (e.g. 1430 = 2:30 PM)

    public Movie(String name, int showTime) {
        this.name = name;
        this.showTime = showTime;
    }

    public String getName() {
        return name;
    }

    public int getShowTime() {
        return showTime;
    }
}
