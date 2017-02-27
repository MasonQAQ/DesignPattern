package com.p05_factory_method_pattern.leifeng;

import com.p04_proxy_pattern.persuit_girl.Persuit;

/**
 * Created by yangyue on 2017/2/26.
 */
public class Undergraduate extends Person implements Leifeng {


    public Undergraduate(String name) {
        super(name);
    }

    @Override
    public void sweep() {
        System.out.println("大学生:"+name+",学习雷锋扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生:"+name+",学习雷锋洗衣服");
    }

    @Override
    public void cook() {
        System.out.println("大学生:"+name+",学习雷锋做饭");
    }
}
