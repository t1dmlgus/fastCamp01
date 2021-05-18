package com.s1dmlgus.fastCamp011.ch07.serialize;

import com.s1dmlgus.fastCamp011.ch07.serialize.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
class Person1 implements Serializable {

    private String name;
    transient private String job;


}



public class SerializationTest {

    public static void main(String[] args) {


        Person p1 = new Person("이순신", "조선");
        Person p2 = new Person("김유신", "신라");


        // 1. 쓰다.
        try {
            FileOutputStream fos = new FileOutputStream("serial.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);
            oos.writeObject(p2);

        } catch (IOException e) {
            e.printStackTrace();
        }


        // 2. 읽다.
        try {
            FileInputStream fos = new FileInputStream("serial.txt");

            ObjectInputStream ois = new ObjectInputStream(fos);


            Person pa = (Person) ois.readObject();
            Person pb = (Person) ois.readObject();

            System.out.println(pa);
            System.out.println(pb);

        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
