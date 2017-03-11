package com.p15_composite_pattern.company;

/**
 * Created by yangyue on 2017/3/9.
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment() {
    }

    public FinanceDepartment(String name) {
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
        System.out.println(name + "财务收支管理");
    }
}
