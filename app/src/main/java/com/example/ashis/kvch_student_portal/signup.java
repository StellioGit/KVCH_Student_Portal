package com.example.ashis.kvch_student_portal;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {

    private EditText  eemail, epass,econtact,ename;
    private String email,pass,contact,name;
    private Button signupbtn;
    private FirebaseAuth auth;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        eemail=findViewById(R.id.eemail);
        econtact=findViewById(R.id.econtact);
        ename=findViewById(R.id.ename);
        epass=findViewById(R.id.epass);

        signupbtn=findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email = eemail.getText().toString();
                pass = epass.getText().toString();
                name=ename.getText().toString();
                contact=econtact.getText().toString();

                if (email.isEmpty())
                {
                    eemail.setError("required.");

                }
                else if(pass.isEmpty())
                {
                    epass.setError("required.");
                }

                else if(name.isEmpty())
                {
                    ename.setError("required");

                }
                else if(contact.isEmpty())
                {
                    econtact.setError("required");

                }

                else
                {
                    auth = FirebaseAuth.getInstance();
                     auth.createUserWithEmailAndPassword(email, pass)
                            .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                @Override
                                public void onSuccess(AuthResult authResult) {
                                    Toast.makeText(signup.this, "success.", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(signup.this, "try again.", Toast.LENGTH_SHORT).show();
                                    ename.setText("");
                                    econtact.setText("");
                                    eemail.setText("");
                                    epass.setText("");

                                }
                            });
                }
            }
        });

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
// TODO: Add adView to your view hierarchy.
    }
}

