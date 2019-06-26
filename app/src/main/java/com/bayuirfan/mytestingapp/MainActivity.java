package com.bayuirfan.mytestingapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_text);
        button = findViewById(R.id.btn_set_value);

        names = new ArrayList<>();
        names.add("Bayu Irfan");
        names.add("Pie");
        names.add("Nougat");

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < names.size(); i++){
                    builder.append(names.get(i)).append("\n");
                }
                textView.setText(builder);
            }
        });
    }
}