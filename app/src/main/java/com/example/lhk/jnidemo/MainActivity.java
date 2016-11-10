package com.example.lhk.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lhk.jnidemo.jni.MathKit;
import com.example.lhk.jnidemo.jni.StringKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.tv_result);
        textView.setText("2*2="+ MathKit.square(2));

    }
}
