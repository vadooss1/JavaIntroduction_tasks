package com.company.traffic;


public class Airplane extends Vehicle {

    protected final int tankVolume = 1000;
    protected final int fuelConsumptionFor100km_Liters = 30;
    protected final int fuelCost_1liter = 1;

    public Airplane(int numberSeats, int ticketPrice, double distance) {
        super(numberSeats, ticketPrice, 600, distance);
    }
    public boolean checkDistance(){
        return tankVolume/fuelConsumptionFor100km_Liters*100>=distance;
    }
    public int getFullticketPrice(){
    return (int) (distance*fuelConsumptionFor100km_Liters/100*fuelCost_1liter)/numberSeats + ticketPrice;
    }
}
