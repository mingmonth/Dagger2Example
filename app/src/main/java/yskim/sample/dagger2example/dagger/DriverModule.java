package yskim.sample.dagger2example.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import yskim.sample.dagger2example.car.Driver;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
