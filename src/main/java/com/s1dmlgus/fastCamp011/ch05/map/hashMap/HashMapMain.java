package com.s1dmlgus.fastCamp011.ch05.map.hashMap;

import java.util.HashMap;


public class HashMapMain {

    public static void main(String[] args) {

        HashMap<Integer, Member> hashMap = new HashMap<>();

        hashMap.put(1, new Member(1001, "홍길동"));
        hashMap.put(2, new Member(1002, "이순신"));
        hashMap.put(3, new Member(1003, "강감찬"));
        hashMap.put(3, new Member(1004, "강감02찬"));


        for (Member value : hashMap.values()) {
            System.out.println("value = " + value);
        }

    }
}
