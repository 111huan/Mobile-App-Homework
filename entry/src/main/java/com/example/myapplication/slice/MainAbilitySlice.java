package com.example.myapplication.slice;

import com.example.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.aafwk.content.Operation;
import ohos.agp.components.TextField;
import ohos.agp.window.dialog.ToastDialog;
//import ohos.agp.render.render3d.Component;

public class MainAbilitySlice extends AbilitySlice implements Component.ClickedListener{
    Button login;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        login = (Button) findComponentById(ResourceTable.Id_login);
        TextField uname = (TextField) findComponentById(ResourceTable.Id_uname);
        TextField pwd = (TextField) findComponentById(ResourceTable.Id_pwd);

        login.setClickedListener(this);

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
        if(component == login){
            Intent i = new Intent();
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")
                    .withBundleName("com.example.myapplication")
                    .withAbilityName("com.example.myapplication.MainAbility_w")
                    .build();
            i.setOperation(operation);
            startAbility(i);
        }
    }
}
