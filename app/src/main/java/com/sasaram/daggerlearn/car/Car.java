package com.sasaram.daggerlearn.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }
    
    public void drive(){
        engine.start();
        Log.d(TAG, driver + " driving "+ this);
    }



    @Inject
    public void enableRemote(Remote remote){
        remote.setRemoteListener(this);
    }
}
