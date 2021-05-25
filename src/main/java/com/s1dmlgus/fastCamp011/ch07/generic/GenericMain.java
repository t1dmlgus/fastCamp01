package com.s1dmlgus.fastCamp011.ch07.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class GenericMain {

    public static <T, V> double makeRactangle(Point<T, V> p1, Point<T, V> p2) {


        double x1 = ((Number) p1.getX()).doubleValue();
        double y1 = ((Number) p1.getY()).doubleValue();

        double x2 = ((Number) p2.getX()).doubleValue();
        double y2 = ((Number) p2.getY()).doubleValue();



        double width = x2 - x1;
        double height = y2 - y1;

        System.out.println("width = " + width);
        System.out.println("height = " + height);

        return width * height;
    }

    public static void main(String[] args) {
        //SpringApplication.run(GenericMain.class, args);

        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);


        double size = makeRactangle(p1, p2);

        System.out.println("size = " + size);

    }
}
