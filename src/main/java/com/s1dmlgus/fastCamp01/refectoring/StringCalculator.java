package com.s1dmlgus.fastCamp01.refectoring;

import java.util.Arrays;



public class StringCalculator {


    public static int splitAndSum(String text) {

        if (isBlank(text)) {
            return 0;
        }
        return sum(toInt(split(text)));

    }


    private static String[] split(String text) {
        return text.split(",|:");
    }

    private static boolean isBlank(String text) {

        return text.equals("") || text.isEmpty();
    }

    private static int[] toInt(String[] values) {

        return Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
    }

    private static int sum(int[] values) {

        int result = 0;

        for (int value : values) {
            result += value;
        }
        return result;
    }


}