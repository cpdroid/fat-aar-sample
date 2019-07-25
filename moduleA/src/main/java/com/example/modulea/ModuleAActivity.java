package com.example.modulea;

import android.app.Activity;
import android.os.Bundle;

import com.gongwen.marqueen.SimpleMF;
import com.gongwen.marqueen.SimpleMarqueeView;

import java.util.Arrays;
import java.util.List;

public class ModuleAActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ma_main_layout);

        final List<String> data = Arrays.asList(
                "白日何短短，百年苦易满。\n苍穹浩茫茫，万劫太极长。",
                "麻姑垂两鬓，一半已成霜。\n天公见玉女，大笑亿千场。",
                "吾欲揽六龙，回车挂扶桑。\n北斗酌美酒，劝龙各一觞。",
                "富贵非所愿，与人驻颜光。");


        SimpleMF<String> marqueeFactory = new SimpleMF<>(this);
        marqueeFactory.setData(data);

        SimpleMarqueeView<String> marqueeView = findViewById(R.id.ma_simpleMarqueeView);
        marqueeView.setMarqueeFactory(marqueeFactory);
        marqueeView.startFlipping();
    }
}