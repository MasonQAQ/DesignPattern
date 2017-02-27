package com.p05_factory_method_pattern.calculate;

/**
 * Created by yangyue on 2017/2/26.
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
