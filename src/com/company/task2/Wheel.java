package com.company.task2;

public class Wheel {

    private int radius;
    private String type;

    public Wheel(int radius, String type) {
        this.radius = radius;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", type='" + type + '\'' +
                '}';
    }
}
