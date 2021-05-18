package com.s1dmlgus.fastCamp011.입출력;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2Test {

    public static void main(String[] args) throws FileNotFoundException {
                                                                        
                                                                        // true - 추가
        FileOutputStream fos = new FileOutputStream("output2.txt",true);

        try (fos) {

            byte[] bs = new byte[26];

            byte data = 65;
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data++;
            }

            fos.write(bs, 2, 10);

        } catch (IOException e) {

            e.printStackTrace();
        }


    }

}
