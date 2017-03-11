package com.p09_builder_pattern.person;

/**
 * Created by yangyue on 2017/3/6.
 */
public class FatPersonBuilder extends PersonBuilder {

    @Override
    void buildHead() {
        person.setHead("大头");
    }

    @Override
    void buildBody() {
       person.setBody("胖子");
    }

    @Override
    void buildHand() {
        person.setHand("大胳膊");
    }

    @Override
    void buildFoot() {
        person.setFoot("粗腿");
    }
}
