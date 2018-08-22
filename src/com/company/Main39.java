package com.company;

public class Main39 {
    public static void main(String[] args) {
        //task 39 Generation of passwords
        int amount = 8;
        char[] bigAZ = new char[26];
        char[] smallaz = new char[26];
        char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_'};
        generationArrB(bigAZ);
        generationArrS(smallaz);
        char[] result = getPassword(amount, bigAZ, smallaz, digit);
        System.out.println(result);
        mix(result);
        System.out.println(result);

    }

    static void generationArrB(char[] arr) {
        int n = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            arr[n] = i;
            n++;
        }
    }

    static void generationArrS(char[] arr) {
        int n = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            arr[n] = i;
            n++;
        }
    }

    static char[] getPassword(int amount, char[] bigAZ, char[] smallaz, char[] digit) {
        char[] parole = new char[amount];
        int i = 0;
        for (; i < amount / 3; i++) {
            parole[i] = bigAZ[(int) (Math.random() * bigAZ.length)];
        }
        for (; i < 2 * amount / 3; i++) {
            parole[i] = smallaz[(int) (Math.random() * smallaz.length)];
        }
        for (; i < amount; i++) {
            parole[i] = digit[(int) (Math.random() * digit.length)];
        }
        return parole;
    }

    static void mix(char[] arr) {
        int n = 0;
        char p = 0;
        for (int i = 0; i < arr.length; i++) {
            n = (int) (Math.random() * arr.length);
            p = arr[i];
            arr[i] = arr[n];
            arr[n] = p;
        }
    }
}
