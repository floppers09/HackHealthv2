package controller;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import controller.StepController;

/**
 * Created by Dan on 2/3/2018.
 */

public class StepCounterController  implements SensorEventListener {


    TextView stepCount;
    int num = 0;


    private Sensor mStepCounterSensor;

    private Sensor mStepDetectorSensor;

    public StepCounterController(Sensor sensor, TextView view){
        mStepDetectorSensor = sensor;
        stepCount = view;

    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        Sensor sensor = event.sensor;
        if(sensor.getType() == Sensor.TYPE_STEP_DETECTOR){
            stepCount.setText(String.valueOf(num++));

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }



}
