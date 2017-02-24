package com.p03_decorator_pattern;

/**
 * Created by yangyue on 2017/2/25.
 */
public class Tshirts extends Finery {
    @Override
    public void show() {
        System.out.println("T恤");
        super.show();
    }
}
