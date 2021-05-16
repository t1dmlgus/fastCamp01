package com.s1dmlgus.fastCamp011.ch06;


// 지역 내부 클래스
class Outer2{

    int outNum = 100;
    static int sNum = 200;


    // local 메서드 안에 클래스
    Runnable getRunnable(int i) {

        int num = 10;

        class MyRunnable implements Runnable {

            int localNum = 1000;

            @Override
            public void run() {

                // local 변수
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
                




            }
        }

        return new MyRunnable();
    }

}


public class AnonumousInnerTest {

    public static void main(String[] args) {

        Outer2 outer2 = new Outer2();

        // 클래스 호출
        Runnable runnable = outer2.getRunnable(100);

        runnable.run();

    }
}
