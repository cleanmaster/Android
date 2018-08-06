package com.example.welcome.calcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button buttonc,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,buttonequal,buttonadd,buttonmul,buttondiv,buttonsub;
    EditText edt1;
    Float mvalueone,mvaluetwo;
    Boolean maddition,msubtract,mmultiplication,mdivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button) findViewById(R.id.button11);
        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button8);
        button10=(Button) findViewById(R.id.button10);
        buttonadd=(Button) findViewById(R.id.button11);
        buttonsub=(Button) findViewById(R.id.buttonsub);
        buttonmul=(Button) findViewById(R.id.buttonmul);
        buttonc=(Button) findViewById(R.id.buttonc);
        buttondiv=(Button) findViewById(R.id.buttondiv);
        buttonequal=(Button)findViewById(R.id.button12);
        edt1=(EditText)findViewById(R.id.edt1);
        button0.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
        buttonc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                maddition=false;
                msubtract=false;
                mmultiplication=false;
                mdivision=false;
            }
        });
        buttonadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalueone=Float.parseFloat(edt1.getText()+"");
                maddition=true;
                edt1.setText(null);
            }
        });
        buttonsub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalueone=Float.parseFloat(edt1.getText()+"");
                msubtract=true;
                edt1.setText(null);
            }
        });
        buttonmul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalueone=Float.parseFloat(edt1.getText()+"");
                mmultiplication=true;
                edt1.setText(null);
            }
        });
        buttondiv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalueone=Float.parseFloat(edt1.getText()+"");
                mdivision=true;
                edt1.setText(null);
            }
        });
        buttonequal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mvaluetwo=Float.parseFloat(edt1.getText()+"");
                if(maddition==true)
                {
                    edt1.setText(mvalueone+mvaluetwo+"");
                    maddition=false;
                }
                if(msubtract==true)
                {
                    edt1.setText(mvalueone-mvaluetwo+"");
                    msubtract=false;
                }
                if(mmultiplication==true)
                {
                    edt1.setText(mvalueone*mvaluetwo+"");
                    mmultiplication=false;
                }
                if(mdivision==true)
                {
                    edt1.setText(mvalueone/mvaluetwo+"");
                    mdivision=false;
                }
            }
        });

    }
}
