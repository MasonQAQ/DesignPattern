package com.p01_simple_factory_pattern.shop;

/**
 * 正常收费
 * Created by yangyue on 2017/2/24.
 */
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
