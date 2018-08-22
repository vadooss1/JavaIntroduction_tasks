package com.company.implemica_vadim_vz;

import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
        BigInteger digit = sumDigitOf_fact(100);
        System.out.println(digit);

    }

    static BigInteger sumDigitOf_fact(long digit) {//to determine factorial using the BigInteger class through the cycle
        BigInteger sum = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= digit; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        while (!result.equals(BigInteger.ZERO)) {//to sum digit using division by modulus
            sum = sum.add(result.mod(BigInteger.TEN));
            result = result.divide(BigInteger.TEN);
        }
        return sum;
    }

}
