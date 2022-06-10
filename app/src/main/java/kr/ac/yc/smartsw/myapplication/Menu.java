package kr.ac.yc.smartsw.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.Map;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button clockButton = (Button)findViewById(R.id.clock_button);
        clockButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_1 = new Intent(getApplicationContext(), StopWatch.class);
                startActivity(intent_1);
            }
        });

        Button stepButton = (Button)findViewById(R.id.btn_step);
        stepButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_2 = new Intent(getApplicationContext(), StepActivity.class);
                startActivity(intent_2);
            }
        });

        Button mapButton = (Button)findViewById(R.id.btnfragment);
        mapButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_3 = new Intent(getApplicationContext(), MapNaver.class);
                startActivity(intent_3);
            }
        });

        Button noticeButton = (Button)findViewById(R.id.btn_notice);
        noticeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_4 = new Intent(getApplicationContext(), NoticeActivity.class);
                startActivity(intent_4);
            }
        });
    }
}