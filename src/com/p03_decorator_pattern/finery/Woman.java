package com.p03_decorator_pattern.finery;

/**
 * Created by yangyue on 2017/2/25.
 */
public class Woman implements Person {
    private String name;

    public Woman() {
    }

    public Woman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("我是一个女人");
    }
}
