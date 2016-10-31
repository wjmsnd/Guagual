package com.example.lee_pc.guaguale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView1);
        initData();


    }

    private void initData() {
        List<String> rewards=new ArrayList<String>();
        rewards.add("乡下人别乱摸");
        rewards.add("恭喜中奖一毛，已存入零钱");
        rewards.add("404");
        rewards.add("520，局部地震");
        rewards.add("优衣库试衣间代金券");
        rewards.add("夏陌陌炮友面基");
        rewards.add("小拇指体验一次");
        rewards.add("什么都没有");
        rewards.add("抽到一坨屎");
        rewards.add("城会玩");

        //生成随机数
        int max=9;
        int min=0;
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
        textView.setText(rewards.get(s));
    }
}
