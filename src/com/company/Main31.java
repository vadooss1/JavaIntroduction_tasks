package com.company;

public class Main31 {
    public static void main(String[] args) {
        //task 31
        int n = 50;
        int[] arr = new int[n];
        generation(arr);
        System.out.println();
        arrmix(arr);

    }

    static void generation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + ", ");
        }
    }

    static void arrmix(int[] arr) {
        int p;
        int k;
        for (int i = 0; i < arr.length; i++) {
            p = arr[i];
            k = (int) (Math.random() * arr.length);
            arr[i] = arr[k];
            arr[k] = p;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
