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
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fragment2 extends Fragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //recyclerView = recyclerView.findViewById(R.id.recycle);
        //listView = listView.findViewById(R.id.listview);
        View v = inflater.inflate(R.layout.fragment2_layout,container,false);
        //View v = inflater.inflate(R.layout.list_items,container,false);

        //setAdapter();
        return v;
    }

   /* private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(courseList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context.getApplicationContext());
        //recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }*/
}
