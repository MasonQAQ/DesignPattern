package com.p01_simple_factory_pattern.calculate;


/**
 * Created by yangyue on 2017/2/24.
 */
public class SubOperation extends Operation{
    @Override
    public double getResult() {
        return getNumberA()-getNumberB();
    }
}
