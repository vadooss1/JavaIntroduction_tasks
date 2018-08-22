package com.company;

public class Rectangle {
    //task 43
    private int x, y, x1, y1;

    public Rectangle(int x, int y, int x1, int y1){
        if (x<x1&&y<y1){
            this.x=x;
            this.y=y;
            this.x1=x1;
            this.y1=y1;
        }else{
            System.out.println("Wrong data!");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
    public int getArea(){
       return (x1-x)*(y1-y);
    }

}

