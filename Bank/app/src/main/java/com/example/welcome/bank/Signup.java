package com.example.sirohi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.Callable;

public class Signup extends AppCompatActivity {

     public static EditText Age, Height, weight, Name,Email, Pass;
    Button signup, loginbtn;
     String uname, uemail, upass, uheight, uweight, uage;
     public static Float bmival=20.4F;
    public static String bmiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Name = (EditText) findViewById(R.id.name);
        Email = (EditText) findViewById(R.id.email);
        Pass = (EditText) findViewById(R.id.pass);
        Age = (EditText) findViewById(R.id.age);
        Height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
         signup = (Button) findViewById(R.id.Signup);
        loginbtn = (Button) findViewById(R.id.gologin);



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname= Name.getText().toString();
                uemail= Email.getText().toString();
                upass= Pass.getText().toString();
                uage= Age.getText().toString();
                uheight= Height.getText().toString();
                uweight= weight.getText().toString();
                if(uname.equals("")||uemail.equals("")||upass.equals("")||uheight.equals("")||uage.equals("")||uweight.equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill All the Fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    Calculate();




                }
            }
        });

loginbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(Signup.this, Login.class);
        startActivity(i);
    }
});

    }

    public void Calculate(){
        Float age = Float.parseFloat(uage+"");
        Float height = Float.parseFloat(uheight+"");
        Float weight = Float.parseFloat(uweight+"");
         //bmival = weight/(height/100*height/100);
        bmiv = bmival.toString();
       // Double mb = (double) bmival;

    }


}
