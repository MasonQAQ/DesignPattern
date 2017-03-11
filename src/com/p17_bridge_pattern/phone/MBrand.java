package com.p17_bridge_pattern.phone;

import java.util.List;

/**
 * Created by yangyue on 2017/3/10.
 */
public class MBrand extends HandSetBrand {

    public MBrand() {
    }

    public MBrand(String brandName, List<HandSetSoft> handSetSofts) {
        super(brandName, handSetSofts);
    }

    @Override
    public void load() {
        System.out.println("M品牌手机启动...");
        System.out.println("加载程序...");
        for (HandSetSoft s : handSetSofts){
            System.out.println("加载程序:【"+s.getSoftName()+"】完毕");
        }
        System.out.println("系统启动完毕...");
    }

    @Override
    public void run(int i) {
        if (i >= handSetSofts.size()){
            System.out.println("程序不存在");
            return;
        }
        System.out.println("系统正在运行【"+handSetSofts.get(i).getSoftName()+"】");
    }
}
