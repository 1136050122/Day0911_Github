package com.example.lenove.day0911_github;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void click() {
        Toast.makeText(this, "给我過一边", Toast.LENGTH_SHORT).show();

    }
}
