package com.s1dmlgus.fastCamp011.ch03.abstrack;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("AI - 자율 주행을 합니다.");
        System.out.println("AI - 자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("AI - 장애물 앞에서 스스로 멈춥니다.");
    }
}
