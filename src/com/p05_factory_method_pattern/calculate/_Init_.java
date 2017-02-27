package com.p05_factory_method_pattern.calculate;

/**
 * 判断的逻辑变到客户端
 * Created by yangyue on 2017/2/26.
 */
public class _Init_ {
    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        operation.setNumberA(23);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
