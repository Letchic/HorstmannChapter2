package com.letchic;

import com.letchic.travelcalc.Car;
import com.letchic.geometry.Point;

public class Main {
    public static void main(String[] args) {

        Point p = new Point(10,20).translate(30,80).scale(0.5);
        System.out.println(p.getX()+" "+p.getY());

        Car delorian = new Car(10);
        delorian.fillCar(5);
        delorian.move(400);
        delorian.printPosition();
        delorian.fillCar(20);
        delorian.move(700);
        delorian.printPosition();
    }
}
