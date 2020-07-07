package yskim.sample.dagger2example.dagger;

import dagger.Module;
import dagger.Provides;
import yskim.sample.dagger2example.car.Rims;
import yskim.sample.dagger2example.car.Tires;
import yskim.sample.dagger2example.car.Wheels;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
