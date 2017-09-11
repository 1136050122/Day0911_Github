package com.example.lenove.day0911_github;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RelativeLayout activity_main;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAnimtor();

    }

    private void initAnimtor() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(text, "alpha", 1.0f, 0.3f);
        animator.setDuration(2000);
        animator.start();
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                      startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

    private void initView() {
        text = (TextView) findViewById(R.id.mTextView);

    }
}
