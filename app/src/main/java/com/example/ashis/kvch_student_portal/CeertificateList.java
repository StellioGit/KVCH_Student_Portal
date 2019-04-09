package com.example.ashis.kvch_student_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CeertificateList extends AppCompatActivity {

    private ListView certificatelistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceertificate_list);

        certificatelistview=findViewById(R.id.certificatelistview);
        certificatelistview.setAdapter(new CertificateAdapter(getBaseContext(),ListCLass.certificateList));
    }
}
