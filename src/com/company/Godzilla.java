package com.company;

public class Godzilla {
    public int volumeOfstomach;
    public double limitOfstomachPer;
    private int eat;
    private int eate;


    public void sumEat(int sum){
        eat+=sum;
        if (eat>=limitOfstomachPer/100*volumeOfstomach){
            System.out.println("The godzilla is full and can not eat more");
        }
    }
    public boolean checkSumEat(){
        boolean n = eat<limitOfstomachPer/100*volumeOfstomach;
        return n;
    }



}
