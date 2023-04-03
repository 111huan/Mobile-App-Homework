package com.example.myapplication;

import com.example.myapplication.slice.course2Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

    public class course2 extends Ability {
        @Override
        public void onStart(Intent intent) {
            super.onStart(intent);
            super.setMainRoute(course2Slice.class.getName());
        }
    }
