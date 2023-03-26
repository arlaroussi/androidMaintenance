//package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;


import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button q = (Button) findViewById(R.id.button2);
        Button Go = (Button) findViewById(R.id.button);
        EditText log = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText mdp = (EditText) findViewById(R.id.editTextTextPassword);
        q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(1);

            }
            });

            Go.setOnClickListener(new View.OnClickListener() {
            if (mdp == "admin" && log == "admin") {
                public void onClick(View v) {
                    Intent intent = new Intent(FastandQuiklyActivity.this, main_menuActivity.class);  //Lancer l'activité DisplayVue
                    startActivity(intent);
                }
            });
        }
    }
}
