package com.company.sysgears_vadim_z.task1;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main_task1 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Gson json = new Gson();
        Temperature result = new Temperature();
        int userValue;
        String userTypeTemp;

        System.out.print("Enter a value of the temperature -> ");
        while (!ms.hasNextInt()) {
            System.out.print("Invalid data! Enter only integers. Input a value of the temperature -> ");
            ms.next();
        }
        userValue = ms.nextInt();

        System.out.print("Enter a type of the temperature: c (Celsius), k (Kelvin), f (Fahrenheit) -> ");
        userTypeTemp = ms.next();
        while (!userTypeTemp.equals("c") && !userTypeTemp.equals("k") && !userTypeTemp.equals("f")) {
            System.out.print("Error! Input only small latin letters c, k, f -> ");
            userTypeTemp = ms.next();
        }

        result.convertTemp(userValue, userTypeTemp);
        System.out.println(json.toJson(result));
    }
}
