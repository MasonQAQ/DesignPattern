package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public class Center extends Player {

    public Center() {
    }

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "发起进攻");
    }

    @Override
    public void defence() {
        System.out.println("中锋" + name + "发起防御");
    }
}
