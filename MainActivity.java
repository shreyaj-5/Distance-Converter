package com.example.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonMilesToKM = (Button) findViewById(R.id.buttonMilestoKM);
        buttonMilesToKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.distInMiles);
                EditText textBoxKM = (EditText) findViewById(R.id.distInKM);
                double miles = Double.valueOf(textBoxMiles.getText().toString());
                double km = miles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKM.setText(formatVal.format(km));
            }
        });

        Button buttonKMToMiles = (Button) findViewById(R.id.buttonKMtoMiles);
        buttonKMToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.distInMiles);
                EditText textBoxKM = (EditText) findViewById(R.id.distInKM);
                double km = Double.valueOf(textBoxKM.getText().toString());
                double miles = km * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(miles));
            }
        });
    }
}