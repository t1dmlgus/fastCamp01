package com.s1dmlgus.fastCamp011.ch05.set.hashSet;

import java.util.HashSet;

public class SetMain {

    //HashSet<Member> hashSet = new HashSet<>();

    public static void main(String[] args) {

        HashSet<Member> hashSet = new HashSet<>();

        Member m1 = new Member(1001, "이순신");
        Member m2 = new Member(1002, "김유신");
        Member m3 = new Member(1003, "강감찬");

        hashSet.add(m1);
        hashSet.add(m2);
        hashSet.add(m3);


        for (Member member : hashSet) {
            System.out.println("member = " + member);
        }


        Member m4 = new Member(1003, "ㅎㅇㅎ");
        hashSet.add(m4);

        for (Member member : hashSet) {
            System.out.println("member2 = " + member);
        }


    }

}
