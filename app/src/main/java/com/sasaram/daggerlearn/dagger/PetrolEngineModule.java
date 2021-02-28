package com.sasaram.daggerlearn.dagger;

import com.sasaram.daggerlearn.car.Engine;
import com.sasaram.daggerlearn.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine providePetrolEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }

}
