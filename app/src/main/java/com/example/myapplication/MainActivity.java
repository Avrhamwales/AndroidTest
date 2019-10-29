package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    Button add,minus;
    TextView display;
    int point=0;
    Switch sw;
    ImageView iv;
    SeekBar sb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.btnplus);
        minus= (Button)findViewById(R.id.btnminus);
        display = (TextView)findViewById(R.id.txtdisplay);
        sw = (Switch)findViewById(R.id.sw);
        iv = (ImageView)findViewById(R.id.iv);
        sb = (SeekBar)findViewById(R.id.sb);

        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        sw.setOnCheckedChangeListener(this);
        sb.setOnSeekBarChangeListener(this);
        sb.setProgress(100);


    }

    @Override
    public void onClick(View v) {
        if (v==minus){
            point--;
            display.setText("your totol point is "+point);
        }
        if (v == add) {
            point++;
            display.setText("your totol point is "+point);
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            iv.setVisibility(View.VISIBLE);
        }
        else {
            iv.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        float alpha = (float)progress/100;
        iv.setAlpha(alpha);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
