package com.p04_proxy_pattern.persuit_girl;

/**
 * Created by yangyue on 2017/2/26.
 */
public class _Init_ {
    public static void main(String[] args) {

        Girl girl = new Girl("Lijiaojiao");
        Proxy proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
