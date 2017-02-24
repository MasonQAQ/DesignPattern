package com.p01_simple_factory_pattern.calculate;

import java.util.Scanner;

/**
 * Created by yangyue on 2017/2/24.
 */
public class _Init_ {
    public static void main(String[] args) {
        System.out.println("请选择你要进行的运算: +:加法,-:减法,*乘法,/除法");
        Scanner scanner = new Scanner(System.in);
        Operation operation = OperationFactory.createOperate(scanner.nextLine());
        System.out.println("请输入第一个数:");
        operation.setNumberA(scanner.nextDouble());
        System.out.println("请输入第二个数:");
        operation.setNumberB(scanner.nextDouble());
        System.out.println("结果是:"+operation.getResult());
    }
}
