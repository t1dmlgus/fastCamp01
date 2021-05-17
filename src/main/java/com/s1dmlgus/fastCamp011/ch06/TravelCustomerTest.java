package com.s1dmlgus.fastCamp011.ch06;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer t1 = new TravelCustomer("이순신",40,100);
        TravelCustomer t2 = new TravelCustomer("김유신",20, 100);
        TravelCustomer t3 = new TravelCustomer("홍길동", 13, 50);


        // ds
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(t1);
        customerList.add(t2);
        customerList.add(t3);


        System.out.println("1.고객명단출력");

        // 1. 전체 출력
        customerList.stream().forEach(n-> System.out.println("n = " + n));

        // 2. 이름만 호출 (중간연산)
        //customerList.stream().map(c->c.getName()).forEach(n-> System.out.println("n = " + n));
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);

        System.out.println();
        System.out.println("2. 여행경비");
        System.out.println(customerList.stream().mapToInt(TravelCustomer::getPrice).sum());


        List<String> arr = new ArrayList<>();

        System.out.println();
        System.out.println("3. 20세이상 고객, 정렬");
        customerList.stream().filter(c -> c.getAge() >= 20).map(TravelCustomer::getName).sorted()
                .forEach(arr::add);

        for (String o : arr) {
            System.out.println("o = " + o);
        }


    }
}
