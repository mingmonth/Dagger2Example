package yskim.sample.dagger2example;

import android.app.Application;

import yskim.sample.dagger2example.dagger.ActivityComponent;
import yskim.sample.dagger2example.dagger.AppComponent;
//import yskim.sample.dagger2example.dagger.DaggerActivityComponent;
import yskim.sample.dagger2example.dagger.DaggerAppComponent;
import yskim.sample.dagger2example.dagger.DriverModule;

public class ExampleApp extends Application {

//    private ActivityComponent component;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

//        component = DaggerActivityComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//                .build();
//        component = DaggerAppComponent.create();
        component = DaggerAppComponent.factory().create(new DriverModule("yskim"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
