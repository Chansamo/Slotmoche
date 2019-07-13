package com.example.slotnidche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    Random rnd = new Random();

    int BetNumber = 0;

    Button ReScord_btn;
    Button Add_btn;
    Button Mid_btn;
    Button Run_btn;
    Button Back_btn;
    TextView Scord_TV;
    TextView Bet_TV;
    TextView Result_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //按鍵宣告
        ReScord_btn = (Button) findViewById(R.id.btn_ReScord);
        Add_btn = (Button) findViewById(R.id.btn_add);
        Mid_btn = (Button) findViewById(R.id.btn_mid);
        Run_btn = (Button) findViewById(R.id.btn_Run);
        Back_btn = (Button) findViewById(R.id.btn_Back);

        //文字顯示宣告
        Scord_TV = (TextView) findViewById(R.id.tv_scord);
        Bet_TV = (TextView) findViewById(R.id.tv_bet);
        Result_TV = (TextView) findViewById(R.id.tv_Result);

        //為按鈕物件設定監聽器
        ReScord_btn.setOnClickListener(ReScord_btn_OnClickListener);
        Add_btn.setOnClickListener(Add_btn_OnClickListener);
        Mid_btn.setOnClickListener(Mid_btn_OnClickListener);
        Run_btn.setOnClickListener(Run_btn_OnClickListener);
        Back_btn.setOnClickListener(Back_btn_OnClickListener);

    }

    View.OnClickListener ReScord_btn_OnClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Scord_TV.setText("分數 : "  + (rnd.nextInt(100)+1));
        }
    };

    View.OnClickListener Add_btn_OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            BetNumber=BetNumber + 1;
            Bet_TV.setText("籌碼 : "  + BetNumber);
        }
    };

    View.OnClickListener Mid_btn_OnClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            BetNumber=BetNumber - 1;
            Bet_TV.setText("籌碼 : "  + BetNumber);
        }
    };

    View.OnClickListener Run_btn_OnClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Result_TV.setText("結果 : "  + (rnd.nextInt(9)+1) +" , "  + (rnd.nextInt(9)+1)+" , "  + (rnd.nextInt(9)+1));
        }
    };

    View.OnClickListener Back_btn_OnClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Log.d("Tag","onclick");
            Intent intent = new Intent();
            //intent.setClass(SettingActivity.this , MainActivity.class);
            intent.setClass(GameActivity.this , MainActivity.class);
            startActivity(intent);
        }
    };


}
