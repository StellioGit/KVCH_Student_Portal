package com.example.ashis.kvch_student_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CourseList extends AppCompatActivity {

    private ListView clistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        clistview= findViewById(R.id.clistview);
        clistview.setAdapter(new CourseAdapter(getBaseContext(),CourseListClass.courseList));


    }
}
