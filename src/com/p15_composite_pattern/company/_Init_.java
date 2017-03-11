package com.p15_composite_pattern.company;

/**
 * Created by yangyue on 2017/3/9.
 */
public class _Init_ {
    public static void main(String[] args) {

        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany compEast = new ConcreteCompany("华东分公司");
        compEast.add(new HRDepartment("华东分公司人力资源部"));
        compEast.add(new FinanceDepartment("华东分公司财务部"));
        root.add(compEast);

        ConcreteCompany compNanjing = new ConcreteCompany("南京办事处");
        compNanjing.add(new HRDepartment("南京办事处人力资源部"));
        compNanjing.add(new FinanceDepartment("南京办事处财务部"));
        compEast.add(compNanjing);

        ConcreteCompany compHangzhou = new ConcreteCompany("杭州办事处");
        compHangzhou.add(new HRDepartment("杭州办事处人力资源部"));
        compHangzhou.add(new FinanceDepartment("杭州办事处财务部"));
        compEast.add(compHangzhou);

        root.show(1);

        root.lineOfDuty();
    }
}
