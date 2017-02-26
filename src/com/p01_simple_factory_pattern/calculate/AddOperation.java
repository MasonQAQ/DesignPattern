package com.p01_simple_factory_pattern.calculate;


/**
 * AddOperation
 * Created by yangyue on 2017/2/24.
 */
public class AddOperation extends Operation {

    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
