package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthActionCodeException;

public class login extends AppCompatActivity {


    private TextView signuptxt;
    private EditText lemail,lpass;
    private String email, pass, name,contact;
    private Button loginbtn;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signuptxt=findViewById(R.id.signuptxt);
        signuptxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this,signup.class));
            }
        });
        lemail=findViewById(R.id.lemail);
        lpass=findViewById(R.id.lpass);

        loginbtn=findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=lemail.getText().toString();
                pass=lpass.getText().toString();
                auth = FirebaseAuth.getInstance();
                auth.signInWithEmailAndPassword(email,pass)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                editor = getSharedPreferences("mydb",MODE_PRIVATE).edit();
                                editor.putString("keyemail",email);
                                editor.putString("keypass",pass);
                                editor.commit();
                                startActivity(new Intent(login.this,MainTree.class));
                                finish();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(login.this, "you are invalid user, please sign up first.", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(login.this,signup.class));
                            }
                        });
            }
        });
    }
}


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }*/








































  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.addicon)
        {

            Toast.makeText(this, "Admin login", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);

    }
*/

