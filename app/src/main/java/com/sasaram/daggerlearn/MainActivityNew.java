package com.sasaram.daggerlearn;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sasaram.daggerlearn.car.Car;
import com.sasaram.daggerlearn.dagger.CarComponent;
import com.sasaram.daggerlearn.dagger.DaggerCarComponent;
import com.sasaram.daggerlearn.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivityNew extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.toolbar));

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        //this.car = carComponent.getCar();
        carComponent.inject(this);
        car1.drive();
        car2.drive();

    }
}
