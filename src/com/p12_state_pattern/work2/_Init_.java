package com.p12_state_pattern.work2;

/**
 * Created by yangyue on 2017/3/8.
 */
public class _Init_ {

    public static void main(String[] args) {
        Firm firm = new Firm(new MorningState());
        firm.hour = 10;
        firm.doSomething();
        firm.hour = 12;
        firm.doSomething();
        firm.hour = 16;
        firm.doSomething();
        firm.hour = 18;
        firm.doSomething();
    }
}
