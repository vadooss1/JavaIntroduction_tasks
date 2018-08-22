package com.company;

public class Main37 {
    public static void main(String[] args) {
        //task 37
        String first = "МЖВО";
        char[] arr = new char[103];
        generation(first, arr);
        printArr(arr);
        System.out.println();
        char result = more(arr);
        if (result == 'М') {
            System.out.print("more men");
        } else if (result == 'Ж') {
            System.out.print("more women");
        } else if (result == 'В') {
            System.out.print("more vampire");
        } else {
            System.out.print("more werewolf");
        }
    }

    static void generation(String first, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = first.charAt((int) (Math.random() * first.length()));

        }
    }

    static void printArr(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    static char more(char[] arr) {
        int m = 0;
        int w = 0;
        int v = 0;
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'М') {
                m++;
            }
            if (arr[i] == 'Ж') {
                w++;
            }
            if (arr[i] == 'В') {
                v++;
            }
            if (arr[i] == 'О') {
                o++;
            }
        }
        if (m >= w && m >= v && m >= o) {
            return 'М';
        } else if (w >= m && w >= v && w >= o) {
            return 'Ж';
        } else if (v >= m && v >= w && v >= o) {
            return 'В';
        } else {
            return 'О';
        }
    }
}
