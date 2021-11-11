package com.company.task3;

public class City {

    private String name;
    private boolean isCapital;

    public City(String name, boolean isCapital) {
        this.name = name;
        this.isCapital = isCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", isCapital=" + isCapital +
                '}';
    }
}
