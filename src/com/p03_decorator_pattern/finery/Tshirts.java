package com.p03_decorator_pattern.finery;

/**
 * Created by yangyue on 2017/2/25.
 */
public class Tshirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("T恤");
    }
}
