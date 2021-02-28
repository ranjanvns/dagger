package com.sasaram.daggerlearn.dagger;

import com.sasaram.daggerlearn.car.DieselEngine;
import com.sasaram.daggerlearn.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    public int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    /*@Binds
    abstract Engine bindsDieselEngine(DieselEngine dieselEngine);*/

    @Provides
    int provideHorsePower(){
     return horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine engine) {
        return engine;
    }
}
