package com.example.sirohi.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.sirohi.myapplication.Signup.bmiv;
import static com.example.sirohi.myapplication.Signup.bmival;

public class BMICalculator extends AppCompatActivity {

    ImageView point;
    Float bmi;
    TextView bmicount, tip;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        point= (ImageView) findViewById(R.id.pointer);
        bmicount = (TextView) findViewById(R.id.bmival);
        bmicount.setText(bmival.toString());

        tip = (TextView) findViewById(R.id.tip);
        if(Signup.bmival < 18.5){

            tip.setText("Oh no ! You are underweight. \n");
            tip.append(" Do you want some Diet Plans which will suit your requirements and boost your health");


        }
        if (Signup.bmival>=18.5){
            if(Signup.bmival< 24.9){
                tip.setText("Great Job. You are healthy. \n");
                tip.append(" Keep going with it. You can also check our Diet plan to follow.");
                Animation anim1  = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotete60);
                point.startAnimation(anim1);

            }
            if (Signup.bmival>=25.0){
                tip.setText("Not Good. You are Overweight. \n");
                tip.append(" Want to loss weight. We have something for you.");

            }
        }


    }
}
