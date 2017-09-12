package com.example.lenove.day0911_github;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void click() {
        Log.e("TAG","可 能 了你这个人，真尼吗乃菜");
        Toast.makeText(this, "给我過一边", Toast.LENGTH_SHORT).show();

    }
}
