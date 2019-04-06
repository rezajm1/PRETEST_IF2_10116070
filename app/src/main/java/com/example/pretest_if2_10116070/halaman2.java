package com.example.pretest_if2_10116070;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman2 extends AppCompatActivity {
    private Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        masuk = (Button) findViewById(R.id.masuk);
        masuk.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukahalaman3();
            }
        });
    }
    public void bukahalaman3(){
        Intent intent = new Intent(this, halaman3.class);
        startActivity(intent);
    }
}