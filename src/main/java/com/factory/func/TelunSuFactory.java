package com.factory.func;

import com.factory.TeLunSuMilk;

public class TelunSuFactory implements Factory{
    public String getMilk() {
        return new TeLunSuMilk().getMilkName();
    }
}
