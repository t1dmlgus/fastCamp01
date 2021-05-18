package com.s1dmlgus.fastCamp011.입출력;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("out.txt");

            fos.write(65);          // A
            fos.write(67);          // C
            fos.write(69);          // E

        } catch (IOException e) {

            System.out.println("e = " + e);

            e.printStackTrace();
        }
        System.out.println("end");

    }
}
