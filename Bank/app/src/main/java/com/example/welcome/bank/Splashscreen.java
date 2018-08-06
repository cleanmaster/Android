package com.example.sirohi.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Splashscreen extends AppCompatActivity {
    private Thread splashThread;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);




        //Thread to wait for splash screen
        splashThread = new Thread() {

            @Override
            public void run() {
                try {
                    synchronized (this) {
                        //wait given period of time or exit on touch
                        wait(3000);
                    }
                }
                catch (InterruptedException ex) {
                }
                finish();
                // run next activiy
                Intent i= new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);
            }
        };

        splashThread.start();


    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            synchronized (splashThread){
                splashThread.notifyAll();
            }
        }
        return  true;
    }






}
