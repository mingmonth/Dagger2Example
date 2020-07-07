package yskim.sample.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import yskim.sample.dagger2example.car.Engine;
import yskim.sample.dagger2example.car.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

//    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//        return engine;
//    }

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
