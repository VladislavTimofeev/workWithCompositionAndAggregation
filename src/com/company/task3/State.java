package com.company.task3;

import com.company.util.Util;

public class State {

    private Region[] regions;
    private String name;
    private int square;

    public State(String name, int square, Region[] regions) {
        this.name = name;
        this.square = square;
        this.regions = regions;
    }


    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public City getCapital() {
        for (Region region : regions) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    if (city.isCapital()) {
                        return city;
                    }
                }
            }
        }

        return null;
    }

    public int getRegionsCount() {
        return regions.length;
    }


    public Region[] getRegionCentr() {

        return regions;
    }


}
