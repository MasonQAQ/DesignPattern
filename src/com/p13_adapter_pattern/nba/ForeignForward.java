package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public class ForeignForward extends ForeignPlayer {

    public ForeignForward() {
    }

    public ForeignForward(String name) {
        super(name);
    }

    @Override
    public void foreignAttack() {
        System.out.println("外籍前锋" + name + "发起进攻");
    }

    @Override
    public void foreignDefense() {
        System.out.println("外籍前锋" + name + "发起防御");
    }
}
