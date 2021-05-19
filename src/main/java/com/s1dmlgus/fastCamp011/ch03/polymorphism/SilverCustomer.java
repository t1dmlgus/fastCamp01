package com.s1dmlgus.fastCamp011.ch03.polymorphism;

public class SilverCustomer extends Customer{

    public SilverCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        grade = "SILVER";
        bonusRatio = 0.01;
        saleRatio = 0;
    }
}
