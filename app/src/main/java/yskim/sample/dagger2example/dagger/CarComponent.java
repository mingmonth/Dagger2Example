package yskim.sample.dagger2example.dagger;

import dagger.Component;
import yskim.sample.dagger2example.MainActivity;
import yskim.sample.dagger2example.car.Car;

@Component(modules = {
        WheelsModule.class,
        DieselEngineModule.class
})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
