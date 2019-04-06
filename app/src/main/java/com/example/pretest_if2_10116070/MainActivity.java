package com.example.pretest_if2_10116070;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;


    /*
    Rezza Jaya Mukti
    10116070
    IF-2
    CHANGE LOG V.0.0.1 Rabu 3 April 2019 02.42
    1.membuat layout tampilan awal

    CHANGE LOG V.0.0.2 Rabu 3 April 2019 15.19
    1.membuat layout tampilan awal

    CHANGE LOG V.0.0.3 Rabu 4 April 2019 03.36
    1.membuat layout tampilan kedua dan perpindahannya

    CHANGE LOG V.0.0.4 Kamis 5 April 2019 22.31
    1.memperbaiki layout halaman 2 dan running di handphone

    CHANGE LOG V.0.0.5 Jumat 6 April 2019 03.30
    1.membuat layout halaman 3 dan 4 dan memperbaiki layout dan build apk
     */

public class MainActivity extends AppCompatActivity {
    private Button mulai;
    @Override

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (Button) findViewById(R.id.mulai);
        mulai.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukahalaman2();
            }
        });
    }
        public void bukahalaman2(){
            Intent intent = new Intent(this, halaman2.class);
            startActivity(intent);
        }
}
