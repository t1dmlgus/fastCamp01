package com.s1dmlgus.fastCamp011.ch03.polymorphism;

public class GoldCustomer extends Customer{

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        grade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.05;
    }
}
