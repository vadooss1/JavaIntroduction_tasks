package com.company.realty;

public class RetailProperty extends Realty {
    protected int proceeds;

    public RetailProperty(double s, double tax, String typeOfRealty, int proceeds) {
        super(s, tax, typeOfRealty);
        this.proceeds = proceeds;
    }

    @Override
    public double getValueTax() {
        if (proceeds >= 100) {
            return super.getValueTax();
        } else {
            return 0;
        }
    }
}
