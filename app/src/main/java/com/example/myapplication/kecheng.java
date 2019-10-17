package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.SimpleAdapter;


public class kecheng extends AppCompatActivity {

    private String[] data={"大学英语","微积分","线性代数","概率论","数据库","数据结构","移动应用开发","用户界面设计","汉语言文学","离散数学","计算机组成原理"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kecheng);

            ArrayAdapter<String> adapter=new ArrayAdapter<String>(kecheng.this,android.R.layout.simple_list_item_1,data);
            ListView listview=(ListView)findViewById(R.id.listview1);
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
                   Bundle bundle = new Bundle();
                  //  bundle.putInt("photo", photo[arg2]);
                   // bundle.putString("message", message[arg2]);


                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    intent.setClass(kecheng.this, xinxi.class);
                  //  Log.i("message", message[arg2]);
                    startActivity(intent);
                }		});

                 }
}
