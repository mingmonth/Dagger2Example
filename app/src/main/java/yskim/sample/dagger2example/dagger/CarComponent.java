package yskim.sample.dagger2example.dagger;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import yskim.sample.dagger2example.MainActivity;
import yskim.sample.dagger2example.car.Car;

@Singleton
@Component(modules = {
        WheelsModule.class,
        PetrolEngineModule.class
})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
