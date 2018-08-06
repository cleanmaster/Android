package com.example.sirohi.myapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PedoMeter extends AppCompatActivity implements SensorEventListener{
    TextView steps, distance, cal;
    Boolean running = false;
    SensorManager sensorManager;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedo_meter);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        steps = (TextView) findViewById(R.id.steps);
        distance = (TextView) findViewById(R.id.dis);
        cal = (TextView) findViewById(R.id.cal);
    }


    @Override
    protected void onResume() {
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

        if (countSensor!=null){
            sensorManager.registerListener(this, countSensor , SensorManager.SENSOR_DELAY_UI);
        }
        else
        {
            Toast.makeText(this, "No Sensor Found", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        running = false;
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if (running){
            steps.setText(count+"");
            Float dis = Float.parseFloat(steps.getText()+"");
            distance.setText(dis/3+"m");
            count += 1;
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
