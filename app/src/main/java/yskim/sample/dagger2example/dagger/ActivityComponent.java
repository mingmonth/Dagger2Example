package yskim.sample.dagger2example.dagger;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import yskim.sample.dagger2example.MainActivity;
import yskim.sample.dagger2example.car.Car;

@PerActivity
@Component(
        dependencies = AppComponent.class,
        modules = {
        WheelsModule.class,
        PetrolEngineModule.class
})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}