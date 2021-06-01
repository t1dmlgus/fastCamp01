package com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.report;

import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Student;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Subject;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class School {

    // 싱글톤 객체
    private static School instance = new School();

    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();


    // 싱글톤 getInstance
    public static School getInstance() {

        if (instance == null)
            instance = new School();
        return instance;

    }

    // 학생 추가
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // 과목 추가
    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

}
