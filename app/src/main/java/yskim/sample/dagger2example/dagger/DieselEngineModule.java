package yskim.sample.dagger2example.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import yskim.sample.dagger2example.car.DieselEngine;
import yskim.sample.dagger2example.car.Engine;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    //    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//        return engine;
//    }

//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

//    @Provides
//    Engine provideEngine() {
//        return new DieselEngine(horsePower);
//    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
