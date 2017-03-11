package com.p17_bridge_pattern.phone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyue on 2017/3/10.
 */
public class _Init_ {
    public static void main(String[] args) {

        List<HandSetSoft> handSetSofts = new ArrayList<>();
        handSetSofts.add(new MessageSoft());
        handSetSofts.add(new PhoneSoft());
        HandSetBrand M = new MBrand("M",handSetSofts);
        M.load();
        M.run(0);
    }
}
