package yskim.sample.dagger2example.dagger;

import javax.inject.Singleton;

import dagger.Component;
import yskim.sample.dagger2example.car.Driver;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();
}
