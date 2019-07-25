package com.example.fataarsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.blankj.utilcode.util.ToastUtils;
import com.example.localmodule.LocalModuleActivity;
import com.example.modulea.ModuleAActivity;
import com.example.mylibrary.LibraryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleAActivity.class);
                startActivity(intent);
                ToastUtils.showLong(R.string.embed_module_a_success);
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocalModuleActivity.class);
                startActivity(intent);
                ToastUtils.showLong(R.string.embed_local_module_success);
            }
        });
    }
}
