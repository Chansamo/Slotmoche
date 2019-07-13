package com.example.slotnidche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button StartGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartGame = (Button) findViewById(R.id.bt_Start);

        StartGame.setOnClickListener(btnStartOnClickListener);

    }

    View.OnClickListener btnStartOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Log.d("Tag", "onclick");
            Intent intent = new Intent();
            //intent.setClass(SettingActivity.this , MainActivity.class);
            intent.setClass(MainActivity.this, GameActivity.class);
            startActivity(intent);
        }
    };

}
