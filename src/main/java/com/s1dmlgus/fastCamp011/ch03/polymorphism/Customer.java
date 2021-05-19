package com.s1dmlgus.fastCamp011.ch03.polymorphism;


import lombok.Data;

@Data
public class Customer {

    private int customerId;
    private String customerName;

    protected String grade;

    protected int bonusPoint;
    protected double bonusRatio;
    protected double saleRatio;

    // 생성자
    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        grade = "SILVER";
        bonusRatio = 0.01;
    }


    // 보너스포인트
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    // 사용자 정보
    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + grade + "이며 "
                + ", 보너스 포인트는 " + bonusPoint + "입니다";
    }


}
