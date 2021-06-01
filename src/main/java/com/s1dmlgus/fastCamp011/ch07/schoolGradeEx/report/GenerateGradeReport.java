package com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.report;

import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.Evalution.BasicEvalution;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.Evalution.GradeEvalution;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.Evalution.MajorEvalution;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Define;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Score;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Student;
import com.s1dmlgus.fastCamp011.ch07.schoolGradeEx.domain.Subject;

import java.util.ArrayList;

public class GenerateGradeReport {

    // 싱글톤
    School school = School.getInstance();

    public static final String TITLE = "수강생 학점 \t\t\n";
    public static final String HEADER = "이름 | 학번 | 전공점수 | 점수   \n";
    public static final String LINE = "----------------------------    \n";

    StringBuffer stringBuffer = new StringBuffer();

    public String getReport(){

        ArrayList<Subject> subjectList = school.getSubjectList();
        for (Subject subject : subjectList) {

            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return stringBuffer.toString();         // String으로 반환
    }

    public void makeHeader(Subject subject) {

        stringBuffer.append(GenerateGradeReport.LINE);
        stringBuffer.append("\t" + subject.getSubjectName());
        stringBuffer.append(GenerateGradeReport.TITLE);
        stringBuffer.append(GenerateGradeReport.HEADER);
        stringBuffer.append(GenerateGradeReport.LINE);


    }


    public void makeBody(Subject subject) {

        // 각 과목의 학생들
        ArrayList<Student> studentList = subject.getStudentList();

        for (Student student : studentList) {

            stringBuffer.append(student.getStudentName());
            stringBuffer.append("  |  ");
            stringBuffer.append(student.getStudentId());
            stringBuffer.append("  |  ");
            stringBuffer.append(student.getMajorSubject().getSubjectName() + "\t");
            stringBuffer.append("  |  ");


            // 학생 별 해당과목 학점 계산
            getScoreGrade(student, subject.getSubjectId());
            stringBuffer.append("\n");
            stringBuffer.append(LINE);

        }
    }

    // 각 학생의 과목등급가져오기
    private void getScoreGrade(Student student, int subjectId) {

        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId();

        // 학점 평가 클래스
        GradeEvalution[] gradeEvalution = {new BasicEvalution(), new MajorEvalution()};

        for (Score score : scoreList) {
            if (score.getSubject().getSubjectId() == subjectId) {

                String grade;
                
                // 중점 과목 학점 평가
                if (score.getSubject().getSubjectId() == majorId) {
                    grade = gradeEvalution[Define.SAB_TYPE].getGrade(score.getPoint());
                }else
                    grade = gradeEvalution[Define.AB_TYPE].getGrade(score.getPoint());

                stringBuffer.append(score.getPoint());
                stringBuffer.append(":");
                stringBuffer.append(grade);
                stringBuffer.append(" | ");
            }
        }

    }

    public void makeFooter(){

        stringBuffer.append("\n");
    }


}
