package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainCourse extends AppCompatActivity {

    private EditText emid,emcourse;
    private Button lstbtn,savebtn;
    private String id,course;
    private Course m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

        emid=findViewById(R.id.emid);
        emcourse=findViewById(R.id.emcourse);

        savebtn=findViewById(R.id.savebtn);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(emid.getText().toString().isEmpty())
                {
                    emid.setError("required");

                }
                else if(emcourse.getText().toString().isEmpty())
                {
                    emcourse.setError("required");

                }
                else
                {
                id=emid.getText().toString();
                course=emcourse.getText().toString();

                m=new Course();
                m.setId(id);
                m.setCourse(course);

                    if(CourseListClass.courseList.add(m))
                    {

                        Toast.makeText(MainCourse.this,"record added...",Toast.LENGTH_SHORT).show();
                        emid.setText("");
                        emcourse.setText("");
                         }

                    else
                    {

                        Toast.makeText(MainCourse.this,"try again",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        lstbtn=findViewById(R.id.lstbtn);
        lstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainCourse.this,CourseList.class));
            }
        });

                }






}
