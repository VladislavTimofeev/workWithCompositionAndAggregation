package com.company.task2;

import com.company.util.Util;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Task2 {

    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(16,"cast");
        Wheel wheel2 = new Wheel(16,"cast");
        Wheel wheel3 = new Wheel(16,"cast");
        Wheel wheel4 = new Wheel(16,"cast");
        Wheel[] wheels = new Wheel[]{wheel1,wheel2,wheel3,wheel4};

        Engine engine = new Engine("v6",350,3.0);

        Car car = new Car(engine,wheels,"sedan","BMW","blue",70,20,true);

        Wheel newWheel = new Wheel(16,"spare");
        car.changeWheel(newWheel,0);

        for (Wheel wheel : car.getWheels()){
            Util.print(wheel.toString());
        }

        Util.print(car.getBrand());

        Util.print(String.valueOf(car.getFuelVolume()));
        car.refuelCar(10);
        Util.print(String.valueOf(car.getFuelVolume()));

        Util.print(car.isMoving());
        car.changeCarState(false);
        Util.print(car.isMoving());
    }
}
