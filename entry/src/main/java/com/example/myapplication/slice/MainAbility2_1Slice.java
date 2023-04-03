package com.example.myapplication.slice;

import com.example.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.aafwk.content.Operation;
import ohos.agp.components.TextField;
import ohos.agp.window.dialog.ToastDialog;

public class MainAbility2_1Slice extends AbilitySlice implements Component.ClickedListener{
    Button c1, c2, c3, c4,choose1,choose2;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main_ability2_1);

        c1 = (Button) findComponentById(ResourceTable.Id_m1);
        c1.setClickedListener(this);

        c2 = (Button) findComponentById(ResourceTable.Id_m2);
        c2.setClickedListener(this);

        c3 = (Button) findComponentById(ResourceTable.Id_m3);
        c3.setClickedListener(this);

        c4 = (Button) findComponentById(ResourceTable.Id_m4);
        c4.setClickedListener(this);

        choose1 = (Button) findComponentById(ResourceTable.Id_c2);
        choose1.setClickedListener(this);

        choose2 = (Button) findComponentById(ResourceTable.Id_c3);
        choose2.setClickedListener(this);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onClick(Component component) {
        if(component == c1){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.course1")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
        else if(component == c2){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.course2")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
        else if(component == c3){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.course3")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
        else if(component == c4){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.course3")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
        else if(component == choose1){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.MainAbility2_1")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
        else if(component == choose2){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.MainAbility2_2")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
    }
}