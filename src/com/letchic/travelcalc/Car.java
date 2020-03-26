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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.position, position) != 0) return false;
        if (Double.compare(car.fuel, fuel) != 0) return false;
        if (Double.compare(car.gasTankVolume, gasTankVolume) != 0) return false;
        return Double.compare(car.fuelconsumption, fuelconsumption) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long temp;
        temp = Double.doubleToLongBits(position);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fuel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(gasTankVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fuelconsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
