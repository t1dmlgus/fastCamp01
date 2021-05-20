package com.s1dmlgus.fastCamp011.ch03.interfacee2;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();


        // 형변환
        Buy buy = customer;
        buy.buy();
        buy.order();

        Sell sell = customer;
        sell.sell();
        sell.order();           //  재정의 된 order호출




    }
}
