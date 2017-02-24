package com.p02_strategy_pattern.shop;

/**
 * 打折收费
 * Created by yangyue on 2017/2/24.
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1; //默认为1

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
