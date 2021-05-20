package com.s1dmlgus.fastCamp011.ch03.interfacee2;

public class Customer implements Buy,Sell{

    @Override
    public void buy() {
        System.out.println("customer buy");
    }
    

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    
    // default 메서드 재정의
    @Override
    public void order() {
        System.out.println("customer order");
    }


    public void hello() {

        System.out.println("hello");

    }


    
}
