package com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain;

import lombok.Data;

import java.util.ArrayList;



@Data
public class Student {

    private int studentId;                  // 학번
    private String studentName;             // 이름
    private Subject majorSubject;           // 전공과목

    private ArrayList<Score> scoreList = new ArrayList<Score>();  // 성적 리스트

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    // 성적 리스트에 성적 추가
    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }


}
