package com.company;

public class Main34 {
    public static void main(String[] args) {
        //task 34

        int[] arr = {5, 6, 7, 8, 20, 21, 22};
        if (check(arr)) {
            System.out.println("the sequence is increasing");
        } else {
            System.out.println("the sequence is not increasing");
        }


    }

    static boolean check(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {

            } else {
                n++;
            }
        }
        return n == 0;
    }
}
