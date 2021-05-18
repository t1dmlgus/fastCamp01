package com.s1dmlgus.fastCamp011.ch07.decorator;

public class Latte extends Decorator{

    public Latte(Coffee coffee) {
        super(coffee);
    }


    @Override
    public void brewing() {
        super.brewing();
        System.out.println("우유 추가");
    }
}
