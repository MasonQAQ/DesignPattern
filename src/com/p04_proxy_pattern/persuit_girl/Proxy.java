package com.p04_proxy_pattern.persuit_girl;

/**
 * Created by yangyue on 2017/2/26.
 */
public class Proxy implements GiveGift {

    Persuit persuit ;

    public Proxy(Girl girl) {
        this.persuit = new Persuit(girl);
    }

    @Override
    public void giveDolls() {
        persuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        persuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        persuit.giveChocolate();
    }
}
