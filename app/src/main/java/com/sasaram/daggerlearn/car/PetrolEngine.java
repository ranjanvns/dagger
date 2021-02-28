package com.sasaram.daggerlearn.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    private int engineCapacity;


    @Inject
    public PetrolEngine(@Named("Horse Power") int horsePower, @Named("Engine Capacity") int engineCapacity){
     this.horsePower = horsePower;
     this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started with horsePower : "+horsePower + " Engine Capacity : "+engineCapacity);
    }
}
