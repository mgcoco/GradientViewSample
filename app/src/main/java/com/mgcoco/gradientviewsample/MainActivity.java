package com.mgcoco.gradientviewsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mgcoco.gradientview.ControlPoint;
import com.mgcoco.gradientview.GradientView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ControlPoint> controlPoints = new ArrayList<>();

        //Vertical
        controlPoints.add(new ControlPoint(0f, 0.1f));
        controlPoints.add(new ControlPoint(0.25f, 0.9f));
        controlPoints.add(new ControlPoint(0.5f, 0.1f));
        controlPoints.add(new ControlPoint(0.75f, 0.9f));
        controlPoints.add(new ControlPoint(1f, 0.1f));
        ((GradientView)findViewById(R.id.gradient1)).setControlPoints(controlPoints);
    }
}