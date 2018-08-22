package com.company;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        //task 26 Guess a number from 0 to 10 !

        Scanner ms = new Scanner (System.in);

        int compnum = (int) (Math.random()*10);
        int user = -1;

        while (user!=compnum){
            System.out.print("Input number - ");
            user = ms.nextInt();
            if(user<compnum){

                System.out.print("Enter more number. ");
            }else if (user>compnum) {
                System.out.print("Enter less number. ");

            }
        }

        System.out.println("The right number - " + compnum);
        System.out.println("You are the winner!!!");

    }

}

