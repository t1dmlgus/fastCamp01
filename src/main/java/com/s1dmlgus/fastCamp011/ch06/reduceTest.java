package com.s1dmlgus.fastCamp011.ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {


        String s = s1.length() > s2.length() ? s1 : s2;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        return s;
    }
}



public class reduceTest {

    public static void main(String[] args) {

        String greetings[] = {"안녕하세요", "hello", "Good morning", "반갑습니"};

        System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());

    }

}
