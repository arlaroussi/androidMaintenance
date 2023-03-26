//package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class main_menuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button GoSaisieV = (Button) findViewById(R.id.button3);
        Button GoinfoV = (Button) findViewById(R.id.button4);
        Button GoinfoI = (Button) findViewById(R.id.button5);
        Button GoSaisieI = (Button) findViewById(R.id.button6);

        GoSaisieV.setOnClickListener(new com.google.android.filament.View.OnClickListener() {

            public void onClick(com.google.android.filament.View v) {
                Intent intent = new Intent(FastandQuiklyActivity.this, SaisieVehicule.class);  //Lancer l'activité DisplayVue
                startActivity(intent);
            }

               GoinfoV.setOnClickListener(new com.google.android.filament.View.OnClickListener() {

                public void onClick(com.google.android.filament.View v) {
                    Intent intent = new Intent(FastandQuiklyActivity.this, infosSaisie.class);  //Lancer l'activité DisplayVue
                    startActivity(intent);
                }

                GoinfoI.setOnClickListener(new com.google.android.filament.View.OnClickListener() {

                    public void onClick(com.google.android.filament.View v) {
                        Intent intent = new Intent(FastandQuiklyActivity.this, InfosIntervention.class);  //Lancer l'activité DisplayVue
                        startActivity(intent);
                    }
                       GoSaisieI.setOnClickListener(new com.google.android.filament.View.OnClickListener() {

                        public void onClick(com.google.android.filament.View v) {
                            Intent intent = new Intent(FastandQuiklyActivity.this, SaisieIntervention.class);  //Lancer l'activité DisplayVue
                            startActivity(intent);
                        }
        public void onClick(View view) {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    });
    }
