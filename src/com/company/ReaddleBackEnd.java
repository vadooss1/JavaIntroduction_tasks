package com.company;

import java.util.Scanner;

public class ReaddleBackEnd {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int userEnterUsd;
        int indexCurrency;
        double crosscourseUAH = 26.0;
        double crosscourseEUR = 0.84;
        double crosscourseGBP = 0.74;

        System.out.print("Enter the price in USD -> ");

        while (!ms.hasNextInt()) {
            System.out.print("Invalid data. Enter only integers. Enter the price in USD -> ");
            ms.next();
        }
        userEnterUsd = ms.nextInt();

        do{
            System.out.print("Enter the required currency index to convert: 1 for UAH, 2 for EUR, 3 for GBP -> ");
        while(!ms.hasNextInt()){
            System.out.print("Invalid data! Enter only integers from 1 to 3 - 1 for UAH, 2 for EUR, 3 for GBP -> ");
            ms.next();
        }
            indexCurrency = ms.nextInt();
        }while(indexCurrency>3||indexCurrency<=0);

        if(indexCurrency==1){System.out.println("It is " + userEnterUsd*crosscourseUAH + " UAH");}
        else if(indexCurrency==2){System.out.println("It is " + userEnterUsd*crosscourseEUR + " EUR");}
        else if(indexCurrency==3){System.out.println("It is " + userEnterUsd*crosscourseGBP + " GBP");}

        }

    }

