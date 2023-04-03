package com.example.myapplication;

import com.example.myapplication.slice.MainAbility2_1Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility2_1 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbility2_1Slice.class.getName());
    }
}
