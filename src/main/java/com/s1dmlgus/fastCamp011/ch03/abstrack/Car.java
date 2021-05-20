package com.s1dmlgus.fastCamp011.ch03.abstrack;

public abstract class Car {

    // 추상메서드
    public abstract void drive();
    public abstract void stop();

    // 일반메서드
    public void startCar(){
        System.out.println("시동을 켭니다");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다");
    }

    // 템플릿메서드 -> 시나리오, 변하면 안됨 -> final
    final public void run(){

        startCar();
        drive();
        stop();
        turnOff();
    }




}
