package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        ((EditText) findViewById(R.id.questionTextField)).getText().toString();



        String s1 = getIntent().getStringExtra("stringKey1"); // this string will be 'harry potter`
        String s2 = getIntent().getStringExtra("stringKey2"); // this string will be 'voldemort'


    }
}