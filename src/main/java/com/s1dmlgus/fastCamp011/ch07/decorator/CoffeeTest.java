package com.s1dmlgus.fastCamp011.ch07.decorator;

public class CoffeeTest {

    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        espresso.brewing();
        System.out.println("-----------");

        Latte latte = new Latte(espresso);
        latte.brewing();
        System.out.println("-----------");

        Moka moka = new Moka(latte);
        moka.brewing();


    }
}
