package com.p07_template_method_pattern.Exam;

/**
 * Created by yangyue on 2017/2/27.
 */
public class StudentBPaper extends ExamPaper {
    @Override
    public String answer1() {
        return "B";
    }

    @Override
    public String answer2() {
        return "A";
    }
}
