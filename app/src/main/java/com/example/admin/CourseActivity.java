package com.example.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.admin.ui.main.NewDBHandler;


public class CourseActivity extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.class_activity);
        Button delete = findViewById(R.id.delete_course);
        Button save = findViewById(R.id.save_course);
        Intent intent = this.getIntent();

        //if(intent!=null){
            String name = intent.getStringExtra("CourseName");
            String code = intent.getStringExtra("CourseCode");
            TextView coName = findViewById(R.id.textView8);
            TextView coCode = findViewById(R.id.textView7);
            coName.setText(name);
            coCode.setText(code);
        //}

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                NewDBHandler myDb = new NewDBHandler(CourseActivity.this);
                myDb.deleteCourse(name);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {

            }
        });

    }
}
