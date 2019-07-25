package com.example.mylibrary;

import android.app.Activity;
import android.os.Bundle;

import com.gongwen.marqueen.SimpleMF;
import com.gongwen.marqueen.SimpleMarqueeView;

import java.util.Arrays;
import java.util.List;

public class LibraryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_main_layout);

        final List<String> data = Arrays.asList(
                "赵客缦胡缨，吴钩霜雪明。\n银鞍照白马，飒沓如流星。",
                "十步杀一人，千里不留行。\n事了拂衣去，深藏身与名。",
                "闲过信陵饮，脱剑膝前横。\n将炙啖朱亥，持觞劝侯嬴。",
                "三杯吐然诺，五岳倒为轻。\n眼花耳热后，意气素霓生。",
                "救赵挥金槌，邯郸先震惊。\n千秋二壮士，烜赫大梁城。",
                "纵死侠骨香，不惭世上英。\n谁能书阁下，白首太玄经。");

        SimpleMF<String> marqueeFactory = new SimpleMF<>(this);
        marqueeFactory.setData(data);

        SimpleMarqueeView<String> marqueeView = findViewById(R.id.library_simpleMarqueeView);
        marqueeView.setMarqueeFactory(marqueeFactory);
        marqueeView.startFlipping();
    }
}
