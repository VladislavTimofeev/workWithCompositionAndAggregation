package com.company.task3;

import java.util.Arrays;

public class Region {

    private District[] districts;
    private String name;
    private String regionalCenters;

    public Region(District[] districts, String name, String regionalCenters) {
        this.districts = districts;
        this.name = name;
        this.regionalCenters = regionalCenters;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRegionalCenters() {
        return regionalCenters;
    }

    public void setRegionalCenters(String regionalCenters) {
        this.regionalCenters = regionalCenters;
    }

    public String getRegionsCount(){
        return regionalCenters;
    }

    @Override
    public String toString() {
        return "Region{" +
                "district=" + Arrays.toString(districts) +
                ", name='" + name + '\'' +
                ", regionalCenters='" + regionalCenters + '\'' +
                '}';
    }
}
