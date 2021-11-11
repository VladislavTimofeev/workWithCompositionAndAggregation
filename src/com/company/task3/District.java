package com.company.task3;

import java.util.Arrays;

public class District {

    private City[] cities;

    private String name;

    public District(City[] cities, String name) {
        this.cities = cities;
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "District{" +
                "city=" + Arrays.toString(cities) +
                ", name='" + name + '\'' +
                '}';
    }
}
