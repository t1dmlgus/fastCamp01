package com.s1dmlgus.fastCamp011.ch07.decorator;

public class Moka extends Decorator{

    public Moka(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();

        System.out.println("모카 시럽 추가");
    }
}
