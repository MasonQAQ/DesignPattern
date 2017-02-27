package com.p05_factory_method_pattern.leifeng;

/**
 * Created by yangyue on 2017/2/26.
 */
public class _Init_ {
    public static void main(String[] args) {
        IFactory undergraduateFactory = new UndergraduateFactory();
        undergraduateFactory.createLeifeng("xiaoming").sweep();
        undergraduateFactory.createLeifeng("xiaohua").cook();
        IFactory volunteerFactory = new VolunteerFactory();
        volunteerFactory.createLeifeng("daming").sweep();
        volunteerFactory.createLeifeng("dahua").cook();
    }
}
