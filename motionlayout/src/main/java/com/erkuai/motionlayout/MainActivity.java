package com.erkuai.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_translate);

        //view = findViewById(R.id.view);

        setContentView(R.layout.activity_motion);
    }

    public void translate(View view) {
        TransitionManager.beginDelayedTransition((ViewGroup) view.getParent());
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) view.getLayoutParams();
        params.gravity = Gravity.END;
        view.setLayoutParams(params);

    }
}
