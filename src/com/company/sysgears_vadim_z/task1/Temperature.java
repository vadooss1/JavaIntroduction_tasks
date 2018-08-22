package com.company.sysgears_vadim_z.task1;

public class Temperature {
    private String tempC, tempK, tempF;

    public void convertTemp(int userValue, String userTypeTemp) {
        switch (userTypeTemp) {
            case "c":
                tempC = null;
                tempK = (int) (273.15 + userValue) + "K";
                tempF = (int) (userValue * 1.8 + 32) + "F";
                break;
            case "k":
                tempC = (int) (userValue - 273.15) + "C";
                tempK = null;
                tempF = (int) ((userValue - 273.15) * 1.8 + 32) + "F";
                break;
            case "f":
                tempC = (int) ((userValue - 32) / 1.8) + "C";
                tempK = (int) (273.15 + (userValue - 32) / 1.8) + "K";
                tempF = null;
                break;
            default:
                tempC = null;
                tempK = null;
                tempF = null;
        }

    }

}
