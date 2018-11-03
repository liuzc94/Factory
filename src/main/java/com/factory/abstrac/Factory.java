package com.factory.abstrac;

import com.factory.func.MengNiuFactory;
import com.factory.func.TelunSuFactory;

public class Factory extends AbstractFactory {
    @Override
    String getMengNiuMikName() {
        return new MengNiuFactory().getMilk();
    }

    @Override
    String getTeLunSuMikName() {
        return new TelunSuFactory().getMilk();
    }
}
