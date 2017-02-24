package com.p03_decorator_pattern;

/**
 * Created by yangyue on 2017/2/25.
 */
public class Finery implements Person {

    protected Person component;

    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if (component!=null){
            component.show();
        }
    }
}
