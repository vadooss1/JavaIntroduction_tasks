package com.company.traffic;


public class Vehicle {
    protected int numberSeats, ticketPrice;
    protected final int averageSpeed;
    protected double distance;


    public Vehicle(int numberSeats, int ticketPrice, int averageSpeed, double distance) {
        this.numberSeats = numberSeats;
        this.ticketPrice = ticketPrice;
        this.averageSpeed = averageSpeed;
        this.distance = distance;
    }

    public double timeOfTravel(){
        return distance/averageSpeed;
    }
}
