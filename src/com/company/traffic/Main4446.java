package com.company.traffic;

public class Main4446 {
    public static void main(String[] args) {
    int distanceKm = 1000;
    Airplane airplane = new Airplane(100, 100, distanceKm);
    Train train = new Train(80, 10, distanceKm, 9);

    if (!airplane.checkDistance()){
        System.out.println("Go by train because the airplane does not reach");
    }else if(airplane.timeOfTravel()<train.timeOfTravel()&&airplane.getFullticketPrice()<train.getFullticketPrice()){
        System.out.println("The airplane is the fastest and cheapest vehicle");}
        else if(airplane.timeOfTravel()>train.timeOfTravel()&&airplane.getFullticketPrice()>train.getFullticketPrice()){
        System.out.println("The train is the fastest and cheapest vehicle");
    }else if (airplane.timeOfTravel()<train.timeOfTravel()&&airplane.getFullticketPrice()>train.getFullticketPrice()){
        System.out.println("The airplane is the fastest but train is the cheapest vehicle");
    }else if (airplane.timeOfTravel()>train.timeOfTravel()&&airplane.getFullticketPrice()<train.getFullticketPrice()){
        System.out.println("The train is the fastest but airplane is the cheapest vehicle");
    }else{System.out.println("The train and the airplane are equal in cheapness and speed");}
        System.out.println(airplane.getFullticketPrice());
        System.out.println(train.getFullticketPrice());

    }

}
