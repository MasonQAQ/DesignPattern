package com.p05_factory_method_pattern.calculate;

/**
 * Created by yangyue on 2017/2/24.
 */
public class MulOperation extends Operation{
    @Override
    public double getResult() {
        return getNumberA()*getNumberB();
    }
}
