package com.p09_builder_pattern.person;

/**
 * Created by yangyue on 2017/3/6.
 */
public class ThinPersonBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        person.setHead("小头");
    }

    @Override
    public void buildBody() {
        person.setBody("小身板");
    }

    @Override
    public void buildHand() {
        person.setHand("小胳膊");
    }

    @Override
    public void buildFoot() {
        person.setFoot("细腿");
    }
}
