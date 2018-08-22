package com.company.sysgears_vadim_z.task4;

import java.util.Arrays;

public class Main_task4 {
    public static void main(String[] args) {

        Checkpoint payPost = new Checkpoint();
        Driver driverMoney = new Driver();

        driverMoney.paySequence(payPost.tax);

        System.out.println("Payment of checkpoint -> " + Arrays.toString(payPost.tax));
        System.out.println("Sum chekpoint -> " + payPost.sum);
        System.out.println("Sequence of payments  -> " + Arrays.toString(driverMoney.driverMoney));

    }

}

