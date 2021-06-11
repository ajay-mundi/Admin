package com.example.admin;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class Fragment3 extends Fragment {
    private ArrayList<Course> courseList;
    //ArrayAdapter<Course> adapter;
    //private RecyclerView recyclerView;
    ListView listView;
    Activity context;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment3_layout,container,false);
        listView = v.findViewById(R.id.listview);

        String[] display = {"Ajay", "Manvir", "Alex"};
        courseList = new ArrayList<Course>();
        courseList.add(new Course("CVG2031"));
        courseList.add(new Course("GNG2432"));
        courseList.add(new Course("SEG4331"));
        //ArrayAdapter<Course> adapter = new ArrayAdapter<Course>(context.getApplicationContext(), android.R.layout.simple_list_item_1, courseList);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,display);
        listView.setAdapter(listViewAdapter);
        //listView.setAdapter(adapter);
        return v;
    }
}
