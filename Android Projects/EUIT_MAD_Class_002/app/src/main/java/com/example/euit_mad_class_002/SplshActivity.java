package com.example.euit_mad_class_002;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplshActivity extends Activity {

    private Button btGoToNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splsh);

//        getSupportActionBar().setTitle("Splash Screen");


        btGoToNext = findViewById(R.id.btGoToNext);

        btGoToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SplshActivity.this, "You have clicked gotoNext Button from setOnClickListener(). ", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SplshActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplshActivity.this, MainActivity.class);
                intent.putExtra("message", getString(R.string.welcome_message));
                startActivity(intent);
                finish();
            }
        }, 2000);
    }

    /*public void gotoNext(View view) {
        Toast.makeText(SplshActivity.this, "You have clicked gotoNext Button. ", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(SplshActivity.this, MainActivity.class);
        startActivity(intent);
    }*/


}