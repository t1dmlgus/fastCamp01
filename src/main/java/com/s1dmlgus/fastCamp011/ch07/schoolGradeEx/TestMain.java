package com.s1dmlgus.fastCamp011.ch07.schoolGradeEx;

import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Define;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Score;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Student;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Subject;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.report.GenerateGradeReport;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.report.School;

import java.util.ArrayList;

public class TestMain {


    School school = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {

        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();


        String report = test.gradeReport.getReport(); //성적 결과 생성
        System.out.println(report); // 출력

    }

    // 과목 생성
    private void createSubject() {

        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.Math);

        school.addSubject(korean);
        school.addSubject(math);

    }


    // 학생 생성
    private void createStudent() {


        Student stu01 = new Student(211211, "강감찬", korean);
        Student stu02 = new Student(211212, "김유신", math);
        Student stu03 = new Student(211213, "신사임당", korean);
        Student stu04 = new Student(211214, "이순신", korean);
        Student stu05 = new Student(211215, "홍길동", math);

        school.addStudent(stu01);
        school.addStudent(stu02);
        school.addStudent(stu03);
        school.addStudent(stu04);
        school.addStudent(stu05);


        korean.register(stu01);
        korean.register(stu02);
        korean.register(stu03);
        korean.register(stu04);
        korean.register(stu05);

        math.register(stu01);
        math.register(stu02);
        math.register(stu03);
        math.register(stu04);
        math.register(stu05);


        addScoreForStudent(stu01, korean, 95);
        addScoreForStudent(stu01, math, 56);

        addScoreForStudent(stu02, korean, 95);
        addScoreForStudent(stu02, math, 95);

        addScoreForStudent(stu03, korean, 100);
        addScoreForStudent(stu03, math, 88);

        addScoreForStudent(stu04, korean, 89);
        addScoreForStudent(stu04, math, 95);

        addScoreForStudent(stu05, korean, 85);
        addScoreForStudent(stu05, math, 56);




    }


    public void addScoreForStudent(Student student, Subject subject, int point) {

        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);

    }
}
