package com.p07_template_method_pattern.Exam;

/**
 * Created by yangyue on 2017/2/27.
 */
public abstract class ExamPaper {
    public void examQuestion1(){
        System.out.println("如果一个属性为私有属性,应当用什么关键字修饰:A private, B public, C protected");
        System.out.println("答案是:"+answer1());
    }
    protected abstract String answer1();
    public void examQuestion2(){
        System.out.println("如果一个属性为公有属性,应当用什么关键字修饰:A private, B public, C protected");
        System.out.println("答案是:"+answer2());
    }
    protected abstract String answer2();
}
