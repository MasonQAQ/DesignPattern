package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public abstract class ForeignPlayer {

    protected String name;

    public ForeignPlayer() {
    }

    public ForeignPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void foreignAttack();
    public abstract void foreignDefense();
}
