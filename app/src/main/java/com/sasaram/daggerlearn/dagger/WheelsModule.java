package com.sasaram.daggerlearn.dagger;

import com.sasaram.daggerlearn.car.Rims;
import com.sasaram.daggerlearn.car.Tyres;
import com.sasaram.daggerlearn.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    public Rims provideRims(){
        return new Rims();
    }

    @Provides
    public Tyres provideTyres(){
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }


    @Provides
    public Wheels provideWheels(Rims rims, Tyres tyres){
        return new Wheels(rims, tyres);
    }


}
