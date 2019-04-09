package com.example.ashis.kvch_student_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MyprofileList extends AppCompatActivity {
private ListView profilelistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile_list);


        profilelistview=findViewById(R.id.profilelistview);
        profilelistview.setAdapter(new ProfileAdapter(getBaseContext(),ProfileListClass.myProfileClassList));
    }
}
