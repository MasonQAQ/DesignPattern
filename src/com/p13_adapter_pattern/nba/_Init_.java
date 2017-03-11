package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public class _Init_ {
    public static void main(String[] args) {

        Player p1 = new Forward("巴蒂尔");
        Player p2 = new Center("麦克");
        Player p3 = new Translator(new ForeignCenter("姚明"));
        Player p4 = new Translator(new ForeignForward("易建联"));

        p1.attack();
        p2.attack();
        p3.attack();
        p4.attack();

    }
}
