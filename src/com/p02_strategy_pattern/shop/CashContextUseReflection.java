package com.p02_strategy_pattern.shop;

/**
 * Created by yangyue on 2017/3/9.
 */
public class CashContextUseReflection {

    private CashSuper cashSuper;

    public CashContextUseReflection(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.p02_strategy_pattern.shop." + type;
        cashSuper = (CashSuper) Class.forName(className).newInstance();
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

}
