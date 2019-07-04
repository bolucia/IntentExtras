package com.example.intentextras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvAge;
    String name;
    String age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);

        Bundle extras = getIntent().getExtras();
        if (extras !=null);
        {
            String names = extras.getString("etName");
            String ages = extras.getString("etAge");
            tvName.setText(name);
            tvAge.setText(age);
        }

        }
    }


