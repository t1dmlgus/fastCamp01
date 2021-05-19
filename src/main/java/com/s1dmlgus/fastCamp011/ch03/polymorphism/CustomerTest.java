package com.s1dmlgus.fastCamp011.ch03.polymorphism;

import java.util.*;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();


        Customer s1 = new SilverCustomer(100, "s1dmlgus");
        Customer s2 = new GoldCustomer(200, "s2dmlgus");
        Customer s3 = new VipCustomer(300, "s3dmlgus");



        customers.add(s1);
        customers.add(s2);
        customers.add(s3);

        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }

        System.out.println("---------------------------------------");

        int price = 10000;
        for (Customer customer : customers) {

            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하였습니다.");
            System.out.println(customer.getCustomerName()+ "님의 보너스 포인트는 "+ customer.bonusPoint+ " 입니다");

        }

    }
}
