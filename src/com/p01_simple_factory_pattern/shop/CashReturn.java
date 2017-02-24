package com.p01_simple_factory_pattern.shop;

/**
 * 返利收费
 * Created by yangyue on 2017/2/24.
 */
public class CashReturn extends CashSuper{
    private double retMoney = 0;
    private double retCondition = 0;

    public CashReturn() {
    }

    public CashReturn(double retMoney, double retCondition) {
        this.retMoney = retMoney;
        this.retCondition = retCondition;
    }

    public double getRetCondition() {
        return retCondition;
    }

    public void setRetCondition(double retCondition) {
        this.retCondition = retCondition;
    }

    public double getRetMoney() {
        return retMoney;
    }

    public void setRetMoney(double retMoney) {
        this.retMoney = retMoney;
    }

    @Override
    public double acceptCash(double money) {
        if (money > retCondition){
            return money - Math.floor(money/retCondition)*retMoney;
        }
        return money;
    }
}
