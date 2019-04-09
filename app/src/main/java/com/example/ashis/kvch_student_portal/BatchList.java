package com.example.ashis.kvch_student_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class BatchList extends AppCompatActivity {

    private ListView batchlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch_list);

        batchlistview=findViewById(R.id.batchlistview);
        batchlistview.setAdapter(new BatchAdapter(getBaseContext(),BListClass.batchList));


    }
}
