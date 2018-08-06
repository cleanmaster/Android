package com.example.sirohi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class Nearby extends AppCompatActivity {

    ImageView doctor, hospital, chemists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);


        doctor = (ImageView) findViewById(R.id.doc);
        hospital = (ImageView) findViewById(R.id.hos);
        chemists = (ImageView) findViewById(R.id.chem);


        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapintent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=Doctors&hl=en"));
                startActivity(mapintent);

            }
        });


        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapintent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=Hospitals&hl=en"));
                startActivity(mapintent);

            }
        });

        chemists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapintent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.co.uk/maps?q=Chemists&hl=en"));
                startActivity(mapintent);

            }
        });
    }
}
