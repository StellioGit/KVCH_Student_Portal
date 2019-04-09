package com.example.ashis.kvch_student_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ProjectList extends AppCompatActivity {
private ListView  projectlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);

        projectlistview=findViewById(R.id.profilelistview);
        projectlistview.setAdapter(new ProjectAdapter(getBaseContext(),ProjectListClass.projectList));
    }


}
