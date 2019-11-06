package com.erkuai.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_center);
        //setContentView(R.layout.activity_weight);
        //setContentView(R.layout.activity_baseline);
//        setContentView(R.layout.activity_angle);
//        View sun = findViewById(R.id.view1);
//        final View earth = findViewById(R.id.view2);
//        final View moon = findViewById(R.id.view3);
//
//        final ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
//        animator.setDuration(10000);
//        animator.setInterpolator(new LinearInterpolator());
//        animator.setRepeatCount(ValueAnimator.INFINITE);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams
//                        ) earth.getLayoutParams();
//                layoutParams.circleAngle = 45 + animation.getAnimatedFraction() * 360;
//                earth.requestLayout();
//            }
//        });
//
//        final ValueAnimator animator2 = ValueAnimator.ofFloat(0, 1);
//        animator2.setDuration(2000);
//        animator2.setInterpolator(new LinearInterpolator());
//        animator2.setRepeatCount(ValueAnimator.INFINITE);
//        animator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams
//                        ) moon.getLayoutParams();
//                layoutParams.circleAngle = 270 + animation.getAnimatedFraction() * 360;
//                moon.requestLayout();
//            }
//        });
//
//        sun.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animator.start();
//                animator2.start();
//            }
//        });

//        setContentView(R.layout.activity_constrainted);
//        setContentView(R.layout.activity_bias);
       // setContentView(R.layout.activity_gonemargin);
//        setContentView(R.layout.activity_ratio);
        setContentView(R.layout.activity_guideline);

    }
}
