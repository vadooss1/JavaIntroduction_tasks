package com.company;

public class Main35 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 0, 1, 1, 2, 3, 5, 6};
        int n = amount(arr);
        System.out.println(n);
        longMax(arr, n);

    }

    static int amount(int[] arr) {
        int max = 0;
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                n++;
            } else if (n >= max) {
                max = n;
                n = 1;
            }
        }
        if (n > max) {
            max = n;
        }
        return max;

    }

    static void longMax(int[] arr, int n) {
        int[] longer = new int[n];
        int max = 1;
        boolean point = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max++;
            } else if (max == n) {
                for (int k = 0; k < longer.length; k++) {
                    longer[k] = arr[i - n + k];
                }
                point = true;
                break;
            } else {
                max = 1;
            }

        }
        if (!point) {
            for (int i = 0; i < longer.length; i++) {
                longer[i] = arr[arr.length - n + i];
            }
        }

        for (int i = 0; i < longer.length; i++) {
            System.out.print(longer[i] + ", ");
        }
    }

}
