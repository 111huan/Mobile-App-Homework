package com.example.myapplication;

import com.example.myapplication.slice.course4Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class course4 extends Ability{
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(course4Slice.class.getName());
    }
}
