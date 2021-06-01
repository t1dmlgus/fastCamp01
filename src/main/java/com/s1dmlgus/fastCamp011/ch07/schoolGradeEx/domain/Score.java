package com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Score {

    private int studentId;              // 학번
    private Subject subject;            // 과목
    private int point;                  // 점수



}
