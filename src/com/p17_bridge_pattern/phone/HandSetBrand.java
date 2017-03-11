package com.p17_bridge_pattern.phone;

import java.util.List;

/**
 * 手机品牌
 * Created by yangyue on 2017/3/10.
 */
public abstract class HandSetBrand {

    protected String brandName;
    protected List<HandSetSoft> handSetSofts;

    public HandSetBrand() {
    }

    public HandSetBrand(String brandName, List<HandSetSoft> handSetSofts) {
        this.brandName = brandName;
        this.handSetSofts = handSetSofts;
    }

    public List<HandSetSoft> getHandSetSofts() {
        return handSetSofts;
    }

    public void setHandSetSofts(List<HandSetSoft> handSetSofts) {
        this.handSetSofts = handSetSofts;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public abstract void load();
    public abstract void run(int i);
}
