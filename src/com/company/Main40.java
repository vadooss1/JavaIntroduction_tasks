package com.company;


import java.util.Arrays;

public class Main40 {
    public static void main(String[] args) {
        String[] arr = {"aaa", "aba", "baa", "cfd", "fcd", "ab", "a", "fc"};
        String[] sort = sortArr(arr);
        int amount = countElemWithoutAnagr(sort);
        String[] result = arrNoAnagrame(arr, sort, amount);
        printArr(result);


    }

    static String[] sortArr(String[] arr) {
        String[] sort = new String[arr.length];
        char[] n;
        String m;
        for (int i = 0; i < arr.length; i++) {
            n = arr[i].toCharArray();
            Arrays.sort(n);
            m = String.valueOf(n);
            sort[i] = m;
        }
        return sort;
    }

    static int countElemWithoutAnagr(String[] sort) {
        int count = 0;
        for (int i = 0; i < sort.length; i++) {
            int n = 0;
            for (int k = 0; k < sort.length; k++) {
                if (sort[i].equals(sort[k])) {
                    n++;
                }
            }
            if (n == 1) {
                count++;
            }
        }
        return count;
    }

    static String[] arrNoAnagrame(String[] arr, String[] sort, int amount) {
        String[] noAnagrame = new String[amount];
        int n = 0;
        for (int i = 0; i < sort.length; i++) {
            int p = 0;
            for (int k = 0; k < sort.length; k++) {
                if (sort[i].equals(sort[k])) {
                    p++;
                }
            }
            if (p == 1) {
                noAnagrame[n] = arr[i];
                n++;
            }
        }
        return noAnagrame;
    }

    static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
