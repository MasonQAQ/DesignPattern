package com.p02_strategy_pattern.shop;

import java.util.Scanner;

/**
 * Created by yangyue on 2017/2/24.
 */
public class _Init_ {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        System.out.println("请输入商品单价: ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("请输入商品数量: ");
        double count = scanner.nextDouble();
//        System.out.println("请输入收费方式: 正常收费  满300减100  打8折");
        System.out.println("请输入收费方式: CashNormal  CashRebate  CashReturn");
        String type = scanner.next();
//        CashContext cashContext = new CashContext(type);
        CashContextUseReflection cashContext = new CashContextUseReflection(type);
        System.out.println("您总共应该付款:"+cashContext.getResult(price*count));
    }
}
