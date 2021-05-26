package com.s1dmlgus.fastCamp011.ch05.set.treeSet;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member implements Comparable<Member>{

    private int memberId;
    private String memberName;



    // 콜백 함수
    @Override
    public int compareTo(Member member) {

        //return Integer.compare(this.memberId, member.memberId);

        return (this.memberId - member.memberId);
    }
}
