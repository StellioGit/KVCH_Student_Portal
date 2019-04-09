package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Batches extends AppCompatActivity {

    private EditText bid,bno,btrainer,bcourse;
    private String id,batchno,course,trainer;
    private Button save,show;
    private Batch b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batches);

    bid=findViewById(R.id.bid);
    bno=findViewById(R.id.bno);
    bcourse=findViewById(R.id.bcourse);
    btrainer=findViewById(R.id.btrainer);

    save=findViewById(R.id.save);
    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bno.getText().toString().isEmpty())
            {
                bno.setError("required");

            }

            else if(bid.getText().toString().isEmpty())
            {
                bid.setError("required");

            }
            else if(bcourse.getText().toString().isEmpty())
            {
                bcourse.setError("required");

            }
            else if(btrainer.getText().toString().isEmpty())
            {
                btrainer.setError("required");

            }

            else{

            id=bid.getText().toString();
            batchno=bno.getText().toString();
            trainer=btrainer.getText().toString();
            course=bcourse.getText().toString();

            b=new Batch();
            b.setId(id);
            b.setBatchno(batchno);
            b.setTrainer(trainer);
            b.setCourse(course);

            if(BListClass.batchList.add(b))
            {
                Toast.makeText(Batches.this,"record added...",Toast.LENGTH_SHORT).show();
                bid.setText("");
                bno.setText("");
                bcourse.setText("");
                btrainer.setText("");
            }

            else
            {

                Toast.makeText(Batches.this,"try again",Toast.LENGTH_SHORT).show();
            }

            }
        }

    });

    show=findViewById(R.id.show);
    show.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Batches.this,BatchList.class));
        }
    });

    }
}
