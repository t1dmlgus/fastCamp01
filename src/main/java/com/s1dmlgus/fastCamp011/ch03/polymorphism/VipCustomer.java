package com.s1dmlgus.fastCamp011.ch03.polymorphism;

public class VipCustomer extends Customer {



    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);


        grade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    @Override
    public int calcPrice(int price) {


        return super.calcPrice(price);
    }
}
