package com.s1dmlgus.fastCamp011.ch05.set.treeSet;

import java.util.TreeSet;

public class TreeSetMain {


    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        System.out.println("treeSet = " + treeSet);
        for (String s : treeSet) {
            System.out.println("s = " + s);
        }

        TreeSet<Member> treeSet1 = new TreeSet<>();

        treeSet1.add(new Member(1001, "홍길동"));
        treeSet1.add(new Member(1002, "강감찬"));
        treeSet1.add(new Member(1003, "이순신"));
        treeSet1.add(new Member(1003, "이순신"));


        for (Member member : treeSet1) {
            System.out.println("member = " + member);
        }


    }

}
