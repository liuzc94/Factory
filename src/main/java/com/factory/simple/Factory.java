package com.factory.simple;

import com.factory.MengniuMilk;
import com.factory.TeLunSuMilk;

public class Factory {

    public  String getMilk(String name) {
        if ("特仑苏".equals(name)) {
            return new TeLunSuMilk().getMilkName();
        } else if ("蒙牛".equals(name)) {
            return new MengniuMilk().getMilkName();
        } else {
            return "没有这种牛奶产品";
        }
    }


}
