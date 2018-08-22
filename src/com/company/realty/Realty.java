package com.company.realty;

public class Realty {
    protected double s, tax;
    protected String typeOfRealty;

    public Realty(double s, double tax, String typeOfRealty) {
        this.s = s;
        this.tax = tax;
        this.typeOfRealty = typeOfRealty;
    }

    public double getValueTax() {
        return s * tax;
    }
}
