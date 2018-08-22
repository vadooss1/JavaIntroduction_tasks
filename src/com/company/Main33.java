package com.company;

public class Main33 {
    public static void main(String[] args) {
        //task 33
        int[] arr = {5, 1, 8, 3, 8, 2};
        int n = amount(arr);
        arrunique(arr, n);

    }

    static int amount(int[] arr) {
        int z = 0;
        for (int i = 0; i < arr.length; i++) {

            int n = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    n++;
                }
            }
            if (n == 1) {
                z++;
            }
        }
        return z;
    }

    static void arrunique(int[] arr, int n) {
        int[] zero = new int[n];
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            int z = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    z++;
                }
            }
            if (z == 1) {
                zero[p] = arr[i];
                p++;
            }
        }
        for (int i = 0; i < zero.length; i++) {
            System.out.print(zero[i] + ", ");
        }
    }
}