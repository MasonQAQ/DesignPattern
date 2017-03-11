package com.p15_composite_pattern.company;

/**
 * Created by yangyue on 2017/3/9.
 */
public abstract class Company {
    protected String name;

    public Company() {
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void show(int depth);
    public abstract void lineOfDuty();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
