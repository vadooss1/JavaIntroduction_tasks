package com.company;

public class Round {
    private int radius, x, y;

    public Round(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public boolean check(Point point0){
        boolean n = (point0.getX()<=(x+radius)&&point0.getX()>=(x-radius)&&point0.getY()<=(y+radius)&&point0.getY()>=(y-radius));
        return n;
    }
}
