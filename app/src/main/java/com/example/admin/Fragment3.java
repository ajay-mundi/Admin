package com.example.admin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.admin.ui.main.NewDBHandler;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class Fragment3 extends Fragment{
    private ArrayList<Course> courseList;
    ListView listView;
    Activity context;
    Button add;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment3_layout,container,false);
        add = v.findViewById(R.id.Add);
        listView = v.findViewById(R.id.listview);
        courseList = new ArrayList<Course>();
        NewDBHandler myDb = new NewDBHandler(getActivity());
        courseList = myDb.allCourses();
        courseListAdapter adapter = new courseListAdapter(getActivity(), R.layout.adapter_view_layout, courseList);
        listView.setAdapter(adapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
            public void onItemClick(AdapterView<?>adapter,View view, int position, long id) {
              Course selected = courseList.get(position);
              String courseName = selected.getCourseName();
              String courseCode = selected.getCourseCode();

              Intent intent = new Intent(getActivity(), CourseActivity.class);
              intent.putExtra("CourseName", courseName);
              intent.putExtra("CourseCode", courseCode);

              //based on item add info to intent
              startActivity(intent);
          }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                TextView nameIn = v.findViewById(R.id.CourseName);
                String name = nameIn.getText().toString();
                TextView codeIn = v.findViewById(R.id.CourseCode);
                String code = codeIn.getText().toString();
                myDb.addCourse(name,code);
                //myDb.deleteCourse(name);
                courseList.clear();
                courseList.addAll(myDb.allCourses());
                adapter.notifyDataSetChanged();
                nameIn.setText("Course Name");
                codeIn.setText("Course Code");
            }
        });
        return v;
    }


}
