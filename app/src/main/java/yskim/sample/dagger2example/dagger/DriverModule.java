package yskim.sample.dagger2example.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import yskim.sample.dagger2example.car.Driver;

//@Module(subcomponents = ActivityComponent.class)
@Module
//public abstract class DriverModule {
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver provideDriver() {
        return new Driver(driverName);
    }

//    @Provides
//    @Singleton
//    static Driver provideDriver() {
//        return new Driver();
//    }
}
