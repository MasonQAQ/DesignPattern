package com.p15_composite_pattern.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyue on 2017/3/9.
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany() {
    }

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void show(int depth) {
        System.out.println(StringUtil.getInstance().copyStringForNTimes("-",depth) + name);
        for (Company child : children){
            child.show(depth + 4);
        }
    }

    @Override
    public void lineOfDuty() {
        children.forEach(Company::lineOfDuty);
    }
}
