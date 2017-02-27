package com.p05_factory_method_pattern.leifeng;

/**
 * Created by yangyue on 2017/2/26.
 */
public class Volunteer extends Person implements Leifeng {


    public Volunteer(String name) {
        super(name);
    }

    @Override
    public void sweep() {
        System.out.println("志愿者:"+name+",学习雷锋扫地");
    }

    @Override
    public void wash() {
        System.out.println("志愿者:"+name+",学习雷锋洗衣服");
    }

    @Override
    public void cook() {
        System.out.println("志愿者:"+name+",学习雷锋做饭");
    }
}
