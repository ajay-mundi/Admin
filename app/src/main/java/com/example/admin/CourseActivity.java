package com.example.admin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.class_activity);

        Intent intent = this.getIntent();

        if(intent!=null){
            String name = intent.getStringExtra("CourseName");
            String code = intent.getStringExtra("CourseCode");
            TextView coName = findViewById(R.id.textView8);
            TextView coCode = findViewById(R.id.textView7);
            coName.setText(name);
            coCode.setText(code);
        }


    }
}
