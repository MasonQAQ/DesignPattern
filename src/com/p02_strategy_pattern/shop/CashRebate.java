package com.p02_strategy_pattern.shop;

/**
 * 打折收费
 * Created by yangyue on 2017/2/24.
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 0.8; //默认为0.8

    public CashRebate() {
    }

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    public double getMoneyRebate() {
        return moneyRebate;
    }

    public void setMoneyRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
