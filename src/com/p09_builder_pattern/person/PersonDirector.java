package com.p09_builder_pattern.person;

/**
 * Created by yangyue on 2017/3/6.
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildHand();
        personBuilder.buildFoot();
    }
}
