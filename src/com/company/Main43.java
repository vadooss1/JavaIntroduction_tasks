package com.company;

public class Main43 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 10, 20, 30);
        Rectangle rectangle2 = new Rectangle(5, 10, 25, 30);

        if(rectangle1.getArea()>rectangle2.getArea()){
            System.out.println("The area of rectangle1 more than the area of rectangle2");
        }else if(rectangle1.getArea()<rectangle2.getArea()){
            System.out.println("The area of rectangle2 more than the area of rectangle1");
        }else {System.out.println("The areas of rectangle1 and rectangle2 are equal");}

        if(rectangle1.getX()>=rectangle2.getX()&&rectangle1.getX1()<=rectangle2.getX1()
                &&rectangle1.getY()>=rectangle2.getY()&&rectangle1.getY1()<=rectangle2.getY1()){
            System.out.println("The rectangle1 inside the rectangle2");
        }else if(rectangle1.getX()<=rectangle2.getX()&&rectangle1.getX1()>=rectangle2.getX1()
                &&rectangle1.getY()<=rectangle2.getY()&&rectangle1.getY1()>=rectangle2.getY1()){
            System.out.println("The rectangle2 inside the rectangle1");
        }
    }
}
