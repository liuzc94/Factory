package com.factory.func;

import com.factory.MengniuMilk;

public class MengNiuFactory implements Factory {
    public String getMilk() {
        return new MengniuMilk().getMilkName();
    }
}
