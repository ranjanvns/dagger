package com.sasaram.daggerlearn.dagger;

import com.sasaram.daggerlearn.MainActivityNew;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    //Car getCar();

    void inject(MainActivityNew mainActivityNew);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("Horse Power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("Engine Capacity") int engineCapacity);

        CarComponent build();
    }
}
