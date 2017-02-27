package com.p05_factory_method_pattern.leifeng;

/**
 * Created by yangyue on 2017/2/26.
 */
public class Person {
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
