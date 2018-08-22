package com.company.sysgears_vadim_z.task4;

public class Driver {
    protected int[] driverMoney = new int[10];

    public Driver() {
        for (int i = 0; i < driverMoney.length; i++) {
            driverMoney[i] = i + 1;
        }
    }

    public void paySequence(int[] array) {
        int temp;
        int box;
        int min = 1;
        int max = 10;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            boolean check = false;
            while (temp >= min) {
                for (int j = i; j < driverMoney.length; j++) {
                    if (temp == driverMoney[j]) {
                        box = driverMoney[j];
                        driverMoney[j] = driverMoney[i];
                        driverMoney[i] = box;
                        check = true;
                        temp = min;
                        break;
                    }
                }
                temp--;
            }
            if (!check) {
                temp = array[i];
                while (temp < max) {
                    for (int k = i; k < driverMoney.length; k++) {
                        if (temp == driverMoney[k]) {
                            box = driverMoney[k];
                            driverMoney[k] = driverMoney[i];
                            driverMoney[i] = box;
                            temp = max;
                            break;
                        }
                    }
                    temp++;
                }

            }

        }

    }

}
