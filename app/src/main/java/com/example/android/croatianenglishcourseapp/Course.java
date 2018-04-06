package com.example.android.croatianenglishcourseapp;

/**
 * Created by Tea on 6.4.2018..
 */

public class Course
{
    private String name;
    private int courseReference;
    private String Details="No Detail Available";
    public Course (String c,int reference)
    {
        name=c;
        courseReference=reference;
    }
    public Course(String c,String detail,int reference)
    {
        name=c;
        Details=detail;
        courseReference=reference;
    }
    String getName()
    {
        return name;
    }
    int getCourseReference()
    {
        return courseReference;
    }
    String getDetails()
    {
        return Details;
    }
}
