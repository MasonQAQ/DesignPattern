package com.p03_decorator_pattern.phone;

/**
 * Created by yangyue on 2017/2/25.
 */
public class CallFunction extends Function {
    @Override
    public void show() {
        super.show();
        System.out.println("能打电话");
    }
}
