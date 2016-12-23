package com.example.jingjian.udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                Toast.makeText(this,"this is btn1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                Toast.makeText(this,"this is btn2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_3:
                Toast.makeText(this,"this is btn3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_4:
                Toast.makeText(this,"this is btn4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_5:
                Toast.makeText(this,"this is btn5",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
