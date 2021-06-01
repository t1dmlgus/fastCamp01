package com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@NoArgsConstructor
@Data
public class Subject {

    private int subjectId;                  // 과목 번호
    private String subjectName;             // 과목이름
    private int gradeType;                  // 평가 방식

    // 수강 신청한 학생 리스트
    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
    }

    // 수강신청
    public void register(Student student) {
        studentList.add(student);
    }

}
