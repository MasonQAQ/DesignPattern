package com.p07_template_method_pattern.Exam;

/**
 * Created by yangyue on 2017/2/27.
 */
public class _Init_ {
    public static void main(String[] args) {
        ExamPaper examPaperA = new StudentAPaper();
        ExamPaper examPaperB = new StudentBPaper();
        System.out.println("A学生的作答情况");
        examPaperA.examQuestion1();
        examPaperA.examQuestion2();
        System.out.println();
        System.out.println("B学生的作答情况");
        examPaperB.examQuestion1();
        examPaperB.examQuestion2();
    }
}
