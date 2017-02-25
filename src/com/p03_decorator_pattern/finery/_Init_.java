package com.p03_decorator_pattern.finery;

/**
 * Created by yangyue on 2017/2/25.
 */
public class _Init_ {
    public static void main(String[] args) {
        Woman woman = new Woman("yangyue");

        BigTrouser bigTrouser = new BigTrouser();
        Tshirts tshirts = new Tshirts();

        bigTrouser.Decorate(woman);
        tshirts.Decorate(bigTrouser);

        tshirts.show();
    }
}
