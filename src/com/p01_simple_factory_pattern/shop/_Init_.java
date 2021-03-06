package com.p01_simple_factory_pattern.shop;

import java.util.Scanner;

/**
 * 测试
 * Created by yangyue on 2017/2/24.
 */
public class _Init_ {
    public static void main(String[] args) {
        System.out.println("请输入商品单价: ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("请输入商品数量: ");
        double count = scanner.nextDouble();
        System.out.println("请输入收费方式: 正常收费  满300减100  打8折");
        String type = scanner.next();
        System.out.println("您总共应该付款: "+ CashFactory.createCashAccept(type).acceptCash(price*count));
    }
}
