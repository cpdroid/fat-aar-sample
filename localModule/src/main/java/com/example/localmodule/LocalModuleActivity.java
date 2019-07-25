package com.example.localmodule;

import android.app.Activity;
import android.os.Bundle;

import com.gongwen.marqueen.SimpleMF;
import com.gongwen.marqueen.SimpleMarqueeView;

import java.util.Arrays;
import java.util.List;

public class LocalModuleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_module_activity);

        final List<String> data = Arrays.asList(
                "昔人已乘黄鹤去，此地空余黄鹤楼。\n黄鹤一去不复返，白云千载空悠悠。",
                "晴川历历汉阳树，芳草萋萋鹦鹉洲。\n日暮乡关何处是，烟波江上使人愁。");


        SimpleMF<String> marqueeFactory = new SimpleMF<>(this);
        marqueeFactory.setData(data);

        SimpleMarqueeView<String> marqueeView = findViewById(R.id.local_simpleMarqueeView);
        marqueeView.setMarqueeFactory(marqueeFactory);
        marqueeView.startFlipping();
    }
}
