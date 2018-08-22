package com.company.realty;

public class ResidentialProperty extends Realty {
    protected double grant;

    public ResidentialProperty(double s, double tax, String typeOfRealty, double grant) {
        super(s, tax, typeOfRealty);
        this.grant = grant;
    }

    @Override
    public double getValueTax() {
        return s * tax * grant;
    }
}
