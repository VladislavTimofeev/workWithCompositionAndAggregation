package com.company.task2;

public class Car {

    private Engine engine;
    private Wheel[] wheels = new Wheel[4];

    private String bodyType;
    private String brand;
    private String color;
    private int fuelCapacity;  //полный объем
    private int fuelVolume;    // текущий объем

    private boolean isMoving;

    public Car(Engine engine, Wheel[] wheels, String bodyType, String brand,
               String color, int fuelCapacity, int fuelVolume, boolean isMoving) {
        this.engine = engine;
        this.wheels = wheels;
        this.bodyType = bodyType;
        this.brand = brand;
        this.color = color;
        this.fuelCapacity = fuelCapacity;
        this.fuelVolume = fuelVolume;
        this.isMoving = isMoving;
    }

    public void changeCarState(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public void changeWheel(Wheel wheel, int index) {
        if (index >= 0 && index < 4) {
            this.wheels[index] = wheel; // заменить элемент в массиве по индексу
        }
    }

    public void refuelCar(int fuelLiter) {
        if (fuelLiter > 0 && fuelLiter < fuelCapacity && fuelLiter + fuelVolume <= fuelCapacity) {
            fuelVolume += fuelLiter;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String isMoving() {
        return isMoving ? "Едем!" : "Не едем!";
    }
}
