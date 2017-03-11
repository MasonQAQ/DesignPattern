package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public class ForeignCenter extends ForeignPlayer {

    public ForeignCenter(String name) {
        super(name);
    }

    public ForeignCenter() {
    }

    @Override
    public void foreignAttack(){
        System.out.println("外籍中锋" + name + "发起进攻");
    }

    @Override
    public void foreignDefense(){
        System.out.println("外籍中锋" + name + "发起防御");
    }
}
