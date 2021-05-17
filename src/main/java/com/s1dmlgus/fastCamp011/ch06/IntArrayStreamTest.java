package com.s1dmlgus.fastCamp011.ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {


        // 배열
        int[] arr = {2, 1, 5, 4, 3};


        // 1. 반복문 출력
        for (int i : arr) {
            System.out.println("i = " + i);
        }

        System.out.println();

        // 2. stream
        Arrays.stream(arr).forEach(n->{
            System.out.println("n = " + n);
        });

        System.out.println();

        int sum = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();
        IntStream sorted = Arrays.stream(arr).sorted();

        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
        sorted.forEach(n->{
            System.out.println("n = " + n);
        });

        Arrays.stream(arr).forEach(n->{
            System.out.println("a = " + n);
        });


    }
}
