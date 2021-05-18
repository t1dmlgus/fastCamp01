package com.s1dmlgus.fastCamp011.입출력;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void main(String[] args) {

        System.out.println("알파벳 여러개를 쓰고 enter를 누르세요");


        int i;

        try {

            // 보조 스트림 (byte -> 문자)
            InputStreamReader irs = new InputStreamReader(System.in);

            while ((i = irs.read()) != '\n') {

                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
