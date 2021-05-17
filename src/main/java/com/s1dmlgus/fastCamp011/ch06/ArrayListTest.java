package com.s1dmlgus.fastCamp011.ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();

        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");


        // 1.
        Stream<String> stream = sList.stream();         // 스트림 생성
        stream.forEach(n-> System.out.println("n = " + n));
        System.out.println();

        // 2.
        sList.stream().sorted().forEach(t-> System.out.print(t + "\t"));
        System.out.println();

        // 3.
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n + "\t"));
        System.out.println();

        // 4.
        sList.stream().filter(s->s.length() >= 5).forEach(t-> System.out.print(t +"\t"));


    }
}
