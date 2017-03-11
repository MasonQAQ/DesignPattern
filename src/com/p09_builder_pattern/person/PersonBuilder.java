package com.p09_builder_pattern.person;

/**
 * Created by yangyue on 2017/3/6.
 */
public abstract class PersonBuilder {
    protected Person person = new Person();

    abstract void buildHead();
    abstract void buildBody();
    abstract void buildHand();
    abstract void buildFoot();

    public Person getPerson(){
        return this.person;
    }
}
