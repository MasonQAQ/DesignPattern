package com.p15_composite_pattern.company;

/**
 * Created by yangyue on 2017/3/9.
 */
public class HRDepartment extends Company {

    public HRDepartment() {
    }

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void show(int depth) {
        System.out.println(StringUtil.getInstance().copyStringForNTimes("-",depth) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
