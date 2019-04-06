package com.example.pretest_if2_10116070;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman3 extends AppCompatActivity {
    private Button selanjutnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
        selanjutnya = (Button) findViewById(R.id.selanjutnya);
        selanjutnya.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukahalaman4();
            }
        });
    }
    public void bukahalaman4(){
        Intent intent = new Intent(this, halaman4.class);
        startActivity(intent);
    }
}