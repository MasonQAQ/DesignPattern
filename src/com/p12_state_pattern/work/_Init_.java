package com.p12_state_pattern.work;

/**
 * Created by yangyue on 2017/3/8.
 */
public class _Init_ {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
