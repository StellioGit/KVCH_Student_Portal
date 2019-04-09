package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainProject extends AppCompatActivity {

    private EditText epstdntid,epbatchid,epprjctid,epprjctname,epdesc;
    private String stdntid,batchid,prjctid,prjctname,desc;
    private Button synopsis,ppt,sourcecode,prjctchnges,prjctlistbtn;
    private Project prj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_project);

        epbatchid=findViewById(R.id.epbatchid);
        epdesc=findViewById(R.id.epdesc);
        epprjctid=findViewById(R.id.epprjctid);
        epprjctname=findViewById(R.id.epprjctname);
        epstdntid=findViewById(R.id.epstdntid);

        synopsis=findViewById(R.id.synopsis);
        synopsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainProject.this, "synopsis", Toast.LENGTH_SHORT).show();
            }
        });


        ppt=findViewById(R.id.ppt);
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainProject.this, "ppt", Toast.LENGTH_SHORT).show();
            }
        });

        sourcecode=findViewById(R.id.sourcecode);
        sourcecode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainProject.this, "sourcecode", Toast.LENGTH_SHORT).show();
            }
        });

        prjctchnges=findViewById(R.id.prjctchnges);
        prjctchnges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(epbatchid.getText().toString().isEmpty())
                {
                    epbatchid.setError("required");

                }

                else if(epdesc.getText().toString().isEmpty())
                {
                    epdesc.setError("required");

                }
                else if(epprjctid.getText().toString().isEmpty())
                {
                    epprjctid.setError("required");

                }
                else if(epstdntid.getText().toString().isEmpty())
                {
                    epstdntid.setError("required");

                }
                else if(epprjctname.getText().toString().isEmpty())
                {
                    epprjctname.setError("required");

                }

                else{

                    prjctid=epprjctid.getText().toString();
                    desc=epdesc.getText().toString();
                    prjctname=epprjctname.getText().toString();
                    stdntid=epstdntid.getText().toString();
                    batchid=epbatchid.getText().toString();

                    prj=new Project();
                    prj.setStdntid(stdntid);
                    prj.setBatchid(batchid);
                    prj.setPrjctid(prjctid);
                    prj.setPrjctname(prjctname);
                    prj.setDesc(desc);

                    if(ProjectListClass.projectList.add(prj))
                    {

                        Toast.makeText(MainProject.this,"record added...",Toast.LENGTH_SHORT).show();
                        epbatchid.setText("");
                        epstdntid.setText("");
                        epprjctid.setText("");
                        epprjctname.setText("");
                        epdesc.setText("");
                    }

                    else
                    {

                        Toast.makeText(MainProject.this,"try again",Toast.LENGTH_SHORT).show();
                    }
                    }
                }

        });
        prjctlistbtn=findViewById(R.id.prjctlistbtn);
        prjctlistbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainProject.this,ProjectList.class));

            }
        });
    }
}
