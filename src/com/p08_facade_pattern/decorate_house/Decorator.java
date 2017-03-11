package com.p08_facade_pattern.decorate_house;

/**
 * 装修设计师:负责选购和装修
 * Created by yangyue on 2017/3/5.
 */
public class Decorator {

    Bed bed;
    Sofa sofa;

    public Decorator() {
        bed = new Bed();
        sofa = new Sofa();
    }

    public void buy(){
        bed.buy();
        sofa.buy();
    }
    public void decorate(){
        bed.decorate();
        sofa.decorate();
    }
}
