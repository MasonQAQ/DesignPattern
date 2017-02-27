package com.p06_prototype_pattern.student;

/**
 * Created by yangyue on 2017/2/27.
 */
public class Student implements Cloneable {
    private String stuName;
    private String stuSex;
    private int stuAge;
    private String stuMajor;
    private String stuCollege;
    private String stuUniversity;

    public Student(String stuName, String stuSex, int stuAge, String stuMajor, String stuCollege, String stuUniversity) {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuMajor = stuMajor;
        this.stuCollege = stuCollege;
        this.stuUniversity = stuUniversity;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public String getStuCollege() {
        return stuCollege;
    }

    public void setStuCollege(String stuCollege) {
        this.stuCollege = stuCollege;
    }

    public String getStuUniversity() {
        return stuUniversity;
    }

    public void setStuUniversity(String stuUniversity) {
        this.stuUniversity = stuUniversity;
    }

    public Student clone() { // 实现克隆
        Student cpStudent = null;
        try{
            cpStudent=(Student)super.clone();
        }catch (CloneNotSupportedException e) {

        }
        return cpStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuMajor='" + stuMajor + '\'' +
                ", stuCollege='" + stuCollege + '\'' +
                ", stuUniversity='" + stuUniversity + '\'' +
                '}';
    }
}
