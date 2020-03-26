package com.letchic.travelcalc;

public class Car {
    private double position = 0;
    private double fuel = 40;
    private double gasTankVolume = 60;
    private double fuelconsumption;

    public Car (double fuelconsumption){
        this.fuelconsumption=fuelconsumption;
    }

    public void move(double distance){
        double reserve = fuel/fuelconsumption*100;
        if (distance<=reserve){
            position+=distance;
            fuel-=distance/100*fuelconsumption;
        }
        else{
            position+=reserve;
            fuel-=reserve/100*fuelconsumption;
        }
    }

    public void fillCar(double fuel){
        if (this.fuel+fuel<=gasTankVolume) {
            this.fuel += fuel;
        }
        else{
            this.fuel=gasTankVolume;
        }
    }

    public void printPosition (){
        System.out.println("You have traveled "+position+" kilometers from the starting point. "+fuel+" liters of fuel left");
    }
}
