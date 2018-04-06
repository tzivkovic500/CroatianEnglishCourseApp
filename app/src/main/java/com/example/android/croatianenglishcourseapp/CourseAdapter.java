package com.example.android.croatianenglishcourseapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tea on 6.4.2018..
 */

public class CourseAdapter extends ArrayAdapter<Course> {

    private Course course;

    public CourseAdapter(Activity contex, ArrayList<Course> data)
    {
        super(contex,0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        course=(Course) getItem(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView txt_name=(TextView)convertView.findViewById(R.id.course_name_text_view);
        txt_name.setText(course.getName());

        TextView txt_detail=(TextView)convertView.findViewById(R.id.details_text_view);
        txt_detail.setText(course.getDetails());

        return convertView;
    }


}
