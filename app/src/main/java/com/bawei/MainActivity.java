package com.bawei;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.but);
        ButtonListener bb = new ButtonListener();
        button.setOnClickListener(bb);
        button.setOnTouchListener(bb);

    }
    class ButtonListener implements View.OnClickListener, View.OnTouchListener {

        public void onClick(View v) {
            if (v.getId() == R.id.but) {
                Log.d("test", "cansal button ---> click");
            }
        }

        public boolean onTouch(View v, MotionEvent event) {
            if (v.getId() == R.id.but) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    Toast.makeText(MainActivity.this, "用户手指已松开", Toast.LENGTH_SHORT).show();

                }
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d("test", "cansal button ---> down");
                    Toast.makeText(MainActivity.this, "用户按下啊", Toast.LENGTH_SHORT).show();

                }
            }
            return false;
        }

    }}
