package com.example.administrator.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {
    private TextView second_text;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_back= (Button) findViewById(R.id.btn_back);
        second_text= (TextView) findViewById(R.id.second_text);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new FirstEvent("返回按钮被点击了"));
            }
        });
    }
}
