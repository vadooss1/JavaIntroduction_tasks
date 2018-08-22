package com.company.traffic;


public class Train extends Vehicle {
    protected int amountParts;
    protected final int electricConsumptionFor100km_kWt = 100;
    protected final double electricCost_1kWt = 1.5;

    public Train(int numberSeats, int ticketPrice, double distance, int amountParts) {
        super(numberSeats, ticketPrice, 80, distance);
        this.amountParts = amountParts;
    }

    public int getFullticketPrice(){
        return (int) ((distance*electricConsumptionFor100km_kWt/100*electricCost_1kWt)/(numberSeats*amountParts) + ticketPrice);
    }
}
