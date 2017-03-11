package com.p13_adapter_pattern.nba;

/**
 * 前锋
 * Created by yangyue on 2017/3/9.
 */
public class Forward extends Player {

    public Forward() {
    }

    public Forward(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋" + name + "发起进攻");
    }

    @Override
    public void defence() {
        System.out.println("前锋" + name + "发起防御");
    }

}
