package com.s1dmlgus.fastCamp011.ch03.interfacee2;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("buy order");
    }
}
