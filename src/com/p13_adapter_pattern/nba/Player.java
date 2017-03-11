package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public abstract class Player {
    protected String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defence();
}
