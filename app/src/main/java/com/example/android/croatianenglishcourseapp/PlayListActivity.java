package com.example.android.croatianenglishcourseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Tea on 6.4.2018..
 */

public class PlayListActivity extends AppCompatActivity {

    ArrayList<Course> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        courseList=new ArrayList<Course>();

        courseList.add(new Course("Boje - Colors", "Lekcija(Lesson)14", R.raw.boje_colors));
        courseList.add(new Course("Brojevi - Numbers","Lekcija(Lesson)7",R.raw.brojevi_numbers));
        courseList.add(new Course("Godisnja doba - Seasons","Lekcija(Lesson)16",R.raw.godisnjadoba_seasons));
        courseList.add(new Course("Obitelj - Family","Lekcija(Lesson)2",R.raw.obitelj_family));
        courseList.add(new Course("Zanimanja-Activities","Lekcija(Lesson)13",R.raw.zanimanja_activities));



        CourseAdapter adapter = new CourseAdapter(this, courseList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("CourseReference", (courseList.get(i)).getCourseReference());
                intent.putExtra("CourseName", (courseList.get(i)).getName());
                startActivity(intent);
            }
        });


    }



}


