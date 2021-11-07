package com.company.task3;

public class State {

    private Region[] region;

    private String name;
    private int square;

    public State(String name, int square, Region[] region) {
        this.name = name;
        this.square = square;
        this.region = region;
    }


    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
