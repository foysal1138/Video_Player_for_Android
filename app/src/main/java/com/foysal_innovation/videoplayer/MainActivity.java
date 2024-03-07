package com.foysal_innovation.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b_1,b_2,b_3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      b_1 = findViewById(R.id.b_1);
      b_2 = findViewById(R.id.b_2);
      b_3 = findViewById(R.id.b_3);

        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here.......................

                VideoPlayer.video ="https://www.youtube.com/embed/tsMakd5YcVM";

                Intent V_newactivity = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(V_newactivity);


            }
        });

        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here.......................

                VideoPlayer.video ="https://www.youtube.com/embed/CPZx_bsbOnk";

                Intent V_newactivity = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(V_newactivity);


            }
        });

        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here.......................

                VideoPlayer.video ="https://www.youtube.com/embed/w0-y_qif2N8";

                Intent V_newactivity = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(V_newactivity);


            }
        });


    }
}