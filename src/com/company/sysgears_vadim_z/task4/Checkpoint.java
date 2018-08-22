package com.company.sysgears_vadim_z.task4;

public class Checkpoint {
    protected int[] tax = new int[10];
    protected int sum;

    public Checkpoint() {
        do {
            sum = 0;
            for (int i = 0; i < tax.length; i++) {
                tax[i] = (int) (Math.random() * tax.length + 1);
                sum += tax[i];
            }
        } while (sum <= 55);

    }
}



