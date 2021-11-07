package com.company.task3;

public class Region {

    private District[] district;

    private String name;
    private int count;
    private int square;
    private int population;
    private String regionalCenters;

    public Region(String name, int count, int square, int population, String regionalCenters) {
        this.name = name;
        this.count = count;
        this.square = square;
        this.population = population;
        this.regionalCenters = regionalCenters;
    }
}
