package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyProfile extends AppCompatActivity {

    private EditText eprofilename,eprofileemail,eprofilecontct,eprofileclg,eprofilequal,eprofileaddress,eprofilecity,eprofilestate;
    private Button savechanges,listbtn;
    private String name,email,college,qual,address,city,state;
    private long contact;
    private MyProfileClass p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        eprofileaddress=findViewById(R.id.eprofileaddress);
        eprofilecity=findViewById(R.id.eprofilecity);
        eprofilestate=findViewById(R.id.eprofilestate);
        eprofileclg=findViewById(R.id.eprofilecolg);
        eprofilecontct=findViewById(R.id.eprofilecontct);
        eprofilequal=findViewById(R.id.eprofilequal);
        eprofilename=findViewById(R.id.eprofilename);
        eprofileemail=findViewById(R.id.eprofileemail);

        savechanges=findViewById(R.id.savechanges);
        savechanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eprofileaddress.getText().toString().isEmpty())
                {
                    eprofileaddress.setError("required");
                }

                else if(eprofilecity.getText().toString().isEmpty())
                {
                    eprofilecity.setError("required");
                }

                else if(eprofileclg.getText().toString().isEmpty())
                {
                    eprofileclg.setError("required");
                }

                else if(eprofilecontct.getText().toString().isEmpty())
                {
                    eprofilecontct.setError("required");
                }
                else if(eprofilename.getText().toString().isEmpty())
                {
                    eprofilename.setError("required");
                }
                else if(eprofileemail.getText().toString().isEmpty())
                {
                    eprofileemail.setError("required");
                }
                else if(eprofilequal.getText().toString().isEmpty())
                {
                    eprofilequal.setError("required");
                }
                else if(eprofileaddress.getText().toString().isEmpty())
                {
                    eprofileaddress.setError("required");
                }
                else{

                    college=eprofileclg.getText().toString();
                    contact =Long.parseLong(eprofilecontct.getText().toString());
                    address=eprofileaddress.getText().toString();
                    email=eprofileemail.getText().toString();
                    qual=eprofilequal.getText().toString();
                    city=eprofilecity.getText().toString();
                    state=eprofilestate.getText().toString();
                    name=eprofilename.getText().toString();

                    p=new MyProfileClass();
                    p.setName(name);
                    p.setEmail(email);
                    p.setContact(contact);
                    p.setQual(qual);
                    p.setState(state);
                    p.setCity(city);
                    p.setCollege(college);
                    p.setAddress(address);

                    if(ProfileListClass.myProfileClassList.add(p))
                    {


                        Toast.makeText(MyProfile.this, "record added", Toast.LENGTH_SHORT).show();
                        eprofilename.setText("");
                        eprofilestate.setText("");
                        eprofilecity.setText("");
                        eprofilequal.setText("");
                        eprofileemail.setText("");
                        eprofileaddress.setText("");
                        eprofilecontct.setText("");
                        eprofileclg.setText("");

                                            }

                    else
                    {

                        Toast.makeText(MyProfile.this,"try again",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        listbtn=findViewById(R.id.listbtn);
        listbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyProfile.this,MyprofileList.class));
            }
        });
    }


                }


