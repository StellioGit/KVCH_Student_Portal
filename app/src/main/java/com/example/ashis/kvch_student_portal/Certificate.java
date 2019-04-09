package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Certificate extends AppCompatActivity {
    private EditText edtprjctname,edtduraton,edtname,edtclgname,edtqual,edttech,edtstrt,edtend,edtfees,edtcenter,edtemail,edtcontact,edtstdntid;
    private Button submit,listbtn;
    private long contact;
   private  String prjctname,duraton,name,email,strt,end,tech,fees,stdntid,clgname,qual,center;
    private CertificateClass c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

  edtprjctname=findViewById(R.id.edtprjctname);
  edtcenter=findViewById(R.id.edtcenter);
  edtclgname=findViewById(R.id.edtclgname);
  edtemail=findViewById(R.id.edtemail);
  edtcontact=findViewById(R.id.edtcontact);
  edtduraton=findViewById(R.id.edtduration);
  edtname=findViewById(R.id.edtname);
  edttech=findViewById(R.id.edttech);
  edtfees=findViewById(R.id.edtfees);
  edtstrt=findViewById(R.id.edtstrt);
  edtend=findViewById(R.id.edtend);
  edtstdntid=findViewById(R.id.edtstdntid);
  edtqual=findViewById(R.id.edtqual);

  submit=findViewById(R.id.submit);
  submit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Toast.makeText(Certificate.this, "Submit successfully", Toast.LENGTH_SHORT).show();

          if(edtcenter.getText().toString().isEmpty())
          {
              edtcenter.setError("required");
          }

          else if(edtclgname.getText().toString().isEmpty())
          {
              edtclgname.setError("required");
          }

          else if(edtcontact.getText().toString().isEmpty())
          {
              edtcontact.setError("required");
          }

          else if(edtduraton.getText().toString().isEmpty())
          {
              edtduraton.setError("required");
          }
          else if(edtemail.getText().toString().isEmpty())
          {
              edtemail.setError("required");
          }
          else if(edtstrt.getText().toString().isEmpty())
          {
              edtstrt.setError("required");
          }
          else if(edtend.getText().toString().isEmpty())
          {
              edtend.setError("required");
          }
          else if(edttech.getText().toString().isEmpty())
          {
              edttech.setError("required");
          }
          else if(edtfees.getText().toString().isEmpty())
          {
              edtfees.setError("required");
          }
          else if(edtqual.getText().toString().isEmpty())
          {
              edtqual.setError("required");
          }
          else if(edtname.getText().toString().isEmpty())
          {
              edtname.setError("required");
          }
          else if(edtprjctname.getText().toString().isEmpty())
          {
              edtprjctname.setError("required");
          }
          else if(edtstdntid.getText().toString().isEmpty())
          {
              edtstdntid.setError("required");
          }
          else
          {
              clgname=edtclgname.getText().toString();
             contact =Long.parseLong(edtcontact.getText().toString());
              center=edtcenter.getText().toString();
              email=edtemail.getText().toString();
              qual=edtqual.getText().toString();
              prjctname=edtprjctname.getText().toString();
              stdntid=edtstdntid.getText().toString();
              strt=edtstrt.getText().toString();
              end=edtend.getText().toString();
              tech=edttech.getText().toString();
              fees=edtfees.getText().toString();
              name=edtname.getText().toString();
              stdntid=edtstdntid.getText().toString();
              duraton=edtduraton.getText().toString();

              c=new CertificateClass();
              c.setName(name);
              c.setEmail(email);
              c.setContact(contact);
              c.setPrjctname(prjctname);
              c.setStdntid(stdntid);
              c.setStrt(strt);
              c.setEnd(end);
              c.setFees(fees);
              c.setTech(tech);
              c.setQual(qual);
              c.setDuration(duraton);
              c.setClgname(clgname);
              c.setCenter(center);

              if(ListCLass.certificateList.add(c))
              {


                  Toast.makeText(Certificate.this, "record added", Toast.LENGTH_SHORT).show();
                  edtcontact.setText("");
                  edtqual.setText("");
                  edtcenter.setText("");
                  edtname.setText("");
                  edtemail.setText("");
                  edtduraton.setText("");
                  edtprjctname.setText("");
                  edtclgname.setText("");
                  edttech.setText("");
                  edtfees.setText("");
                  edtstrt.setText("");
                  edtend.setText("");
                  edtstdntid.setText("");
              }

              else
              {

                  Toast.makeText(Certificate.this,"try again",Toast.LENGTH_SHORT).show();
              }
          }
      }
  });


        listbtn=findViewById(R.id.listbtn);
        listbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Certificate.this,CeertificateList.class));
            }
        });
    }

}
