package com.example.myapplication;

import com.example.myapplication.slice.course3Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class course3 extends Ability{
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(course3Slice.class.getName());
    }
}
