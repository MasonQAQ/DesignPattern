package com.p17_bridge_pattern.phone;

/**
 * Created by yangyue on 2017/3/10.
 */
public abstract class HandSetSoft {


    protected String softName="";

    public HandSetSoft() {
    }

    public String getSoftName() {
        return softName;
    }

    public abstract void load();
    public abstract void run();
}
