package com.s1dmlgus.fastCamp011.ch05.map.hashMap;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {

    private int memberId;
    private String memberName;


    @Override
    public boolean equals(Object o) {

        if (o instanceof Member) {

            Member member = (Member) o;
            System.out.println(" 덤에스");
            return this.memberId == member.memberId;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return memberId;
    }
}
