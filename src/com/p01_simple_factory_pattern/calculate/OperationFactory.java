package com.p01_simple_factory_pattern.calculate;


/**
 * Created by yangyue on 2017/2/24.
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
        }
        return operation;
    }
}
