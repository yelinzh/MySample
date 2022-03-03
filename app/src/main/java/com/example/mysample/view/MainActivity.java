package com.example.mysample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mysample.R;
import com.example.mysample.utils.MD5Utils;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        btn = (Button)findViewById(R.id.btn);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                text.setText(MD5Utils.md5Password("zh12123"));
//            }
//        });
        btn.setOnClickListener(view -> text.setText(MD5Utils.md5Password("zh12123_")));

    }
}