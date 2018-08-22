package com.company.realty;

public class Main45 {
    public static void main(String[] args) {
        ResidentialProperty res = new ResidentialProperty(50.0, 10.0, "ResidentialProperty", 0.8);
        RetailProperty ret = new RetailProperty(200.0, 10.0, "RetailProperty", 100);
        CommercialProperty com = new CommercialProperty(100.0, 10.0, "CommercialProperty");

        System.out.println(res.typeOfRealty + " value of tax = " + res.getValueTax() + " usd");
        System.out.println(ret.typeOfRealty + " value of tax = " + ret.getValueTax() + " usd");
        System.out.println(com.typeOfRealty + " value of tax = " + com.getValueTax() + " usd");
    }
}
