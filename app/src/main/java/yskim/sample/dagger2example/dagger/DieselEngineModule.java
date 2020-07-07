package yskim.sample.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import yskim.sample.dagger2example.car.DieselEngine;
import yskim.sample.dagger2example.car.Engine;

@Module
public abstract class DieselEngineModule {

//    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//        return engine;
//    }

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
