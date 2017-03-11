package com.p08_facade_pattern.decorate_house;

/**
 * 客户聘请设计师,完成材料选购和装修
 * Created by yangyue on 2017/3/5.
 */
public class _Init_ {
    public static void main(String[] args) {
        Decorator decorator = new Decorator();//聘请设计师
        decorator.buy();
        decorator.decorate();
    }
}
