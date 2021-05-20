package com.s1dmlgus.fastCamp011.ch03.interfacee2;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("sell order");
    }
}
