package com.p02_strategy_pattern.shop;

/**
 * Created by yangyue on 2017/2/24.
 */
public class CashContext {
    private CashSuper cashSuper;

//    在这儿传入cashSuper那么对于客户端(init)来说,判断就回到客户端,这儿和简单工厂模式进行结合
//    public CashContext(CashSuper cashSuper) {
//        this.cashSuper = cashSuper;
//    }


    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300,100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
