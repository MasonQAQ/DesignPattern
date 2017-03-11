package com.p07_template_method_pattern.Exam;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

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

        String url = "http://www.some_domain.com/some_path?keyone=jsonp807&keytwo=foo%2527%2529%2529%2529%2520WAITFOR%2520DELAY%2520%25270%253A0%253A5%2527--&keythree=7964704234";
        try {
            System.out.println(URLDecoder.decode(URLDecoder.decode(url,"utf-8")));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
