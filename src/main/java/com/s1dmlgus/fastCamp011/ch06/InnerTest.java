package com.s1dmlgus.fastCamp011.ch06;



class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;


    // 1. 생성자
    public OutClass() {
        inClass = new InClass();        // 생성자로 innerClass 생성
    }


    // 2. 메소드
    public void usingClass(){
        inClass.inTest();
    }


    // 3. 내부클래스
    class InClass{

        int iNum = 100;
        // static int sInNum = 200;     내부 클래스에 정적(static) 외부클래스가 만들어진 후 만들어지 기 때문에 생성 못함

        void inTest(){

            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }


    // 정적(static) 내부 클래스
    static class InStaticClass{

        int iNum = 110;
        static int sInNum = 220;

        void inTest(){

            // 외부 클래스의 인스턴스 변수 생성 못함 -> 정적클래스가 먼저 생성되고 외부클래스가 생성될 수도 안될 수 도 있으니까
            //System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }


        static void sTest(){    // 정적(static) 변수만 사용가능

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
           // System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");

            
        }

    }

}


public class InnerTest {

    public static void main(String[] args) {

        
        // 내부 클래스
        OutClass outClass = new OutClass();
        outClass.usingClass();

        System.out.println();


        // static 내부 클래스 메서드 
        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();

        System.out.println();

        // static 메서드
        OutClass.InStaticClass.sTest();




    }

}
