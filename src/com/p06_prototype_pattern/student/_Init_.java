package com.p06_prototype_pattern.student;


/**
 * Created by yangyue on 2017/2/27.
 */
public class _Init_ {
    public static void main(String[] args) {
        Student stu1,stu2,stu3;
        stu1 = new Student("张无忌","男",22,"WSN","信息安全","MBA");

        // 使用原型
        long start = System.currentTimeMillis();
        stu2 = stu1.clone();
        stu2.setStuName("杨过");
        long stop = System.currentTimeMillis();
        System.out.println("使用原型模式创建,耗时:"+(stop-start));
        System.out.println(stu2);
        // 使用创建new
        start = System.currentTimeMillis();
        stu3 = new Student("小龙女","男",22,"WSN","信息安全","MBA");
        stop = System.currentTimeMillis();
        System.out.println("使用原型模式创建,耗时:"+(stop-start));
        System.out.println(stu3);
    }
}
