package com.company.implemica_vadim_vz;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int userEnter;

        do { //Here are program checks of an user's enter for the relevant
            System.out.print("Enter only integer positive digit above zero -> ");
            while (!ms.hasNextInt()) {
                System.out.print("Invalid data! Enter only integer -> ");
                ms.next();
            }
            userEnter = ms.nextInt();
        } while (userEnter <= 0);

        System.out.println("Amount of combinations = " + combinationsCatalan(userEnter));

    }

    static BigInteger factorial(int digit) { //to determine a factorial
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= digit; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;

    }

    static BigInteger combinationsCatalan(int n) {//I just use the formula of Catalan's numbers

        return factorial(2 * n).divide(factorial(n).multiply(factorial(n + 1)));
    }

}
