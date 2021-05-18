package com.s1dmlgus.fastCamp011.ch07.decorator;

public abstract class Decorator extends Coffee{

    private Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();

    }
}
