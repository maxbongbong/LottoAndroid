package com.bong.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.next_button);
            btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);
                    startActivity(intent);
                }
            });


    }
}




