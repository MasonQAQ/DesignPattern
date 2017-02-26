package com.p04_proxy_pattern.persuit_girl;

/**
 * Created by yangyue on 2017/2/26.
 */
public class Persuit implements GiveGift{

    Girl girl;

    public Persuit(Girl girl) {
        this.girl = girl;
    }


    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + " 我要送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + " 我要送你花儿");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + " 我要送你巧克力");
    }
}
