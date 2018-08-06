package com.example.sirohi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button loginbtn, skipbtn;
    TextView forgotpass, signup;
    EditText email , pass;
    String uemail, upass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_login);

        loginbtn = (Button) findViewById(R.id.loginbt);
        skipbtn = (Button) findViewById(R.id.skip);
        forgotpass = (TextView) findViewById(R.id.forgot);
        signup = (TextView) findViewById(R.id.signup);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (uemail.equals("")||upass.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields cannot be empty", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
