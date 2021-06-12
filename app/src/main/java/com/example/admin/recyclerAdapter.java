package com.example.admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Course> courseList;

    public recyclerAdapter(ArrayList<Course> coursesList){
        this.courseList =coursesList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.textView);
        }

    }




    @NonNull
    @NotNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = courseList.get(position).getCourseName();
        holder.nameTxt.setText(name);

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
}
