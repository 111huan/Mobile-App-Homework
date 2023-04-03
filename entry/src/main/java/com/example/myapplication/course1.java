package com.example.myapplication;

import com.example.myapplication.slice.course1Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class course1 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(course1Slice.class.getName());
    }
}
