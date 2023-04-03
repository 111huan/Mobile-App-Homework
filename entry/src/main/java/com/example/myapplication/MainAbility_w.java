package com.example.myapplication;

import com.example.myapplication.slice.MainAbility_wSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility_w extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbility_wSlice.class.getName());
    }
}
