package com.example.sirohi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Userinfo extends AppCompatActivity {

    EditText name , age , height , weight ;
    ImageView dismiss, save;
    String Name, Age, Height , Weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);

        dismiss = (ImageView) findViewById(R.id.dismiss);
        save = (ImageView) findViewById(R.id.success);

        Name = name.getText().toString();
        Age = age.getText().toString();
        Height = height.getText().toString();
        Weight = weight.getText().toString();

        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Userinfo.this, MainActivity.class);
                startActivity(i);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.equals("")||Age.equals("")||Height.equals("")||Weight.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter all fields to update,  else click on cancel",Toast.LENGTH_SHORT).show();
                 return;

                }
                else {
                    try {

                    }
                    catch (Exception e){

                    }
                }
            }
        });



    }

}
