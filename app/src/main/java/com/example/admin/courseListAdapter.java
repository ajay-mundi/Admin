package com.example.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class courseListAdapter extends ArrayAdapter<Course> {
    private static final String TAG = "courseListAdapter";
    private Context mContext;
    int mResource;

    public courseListAdapter(Context context, int resource, ArrayList<Course> objects){
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        String courseName = getItem(position).getCourseName();
        String courseCode = getItem(position).getCourseCode();

        Course course = new Course(courseName, courseCode);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = convertView.findViewById(R.id.textView4);
        TextView tvCode = convertView.findViewById(R.id.textView3);

        tvName.setText(courseName);
        tvCode.setText(courseCode);

        return convertView;
    }
}
