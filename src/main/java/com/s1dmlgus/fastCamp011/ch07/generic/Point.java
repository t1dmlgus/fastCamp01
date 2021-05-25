package com.s1dmlgus.fastCamp011.ch07.generic;

import lombok.Data;

@Data
public class Point <T, V>{

    T x;
    V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
}
