package yskim.sample.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import yskim.sample.dagger2example.car.Car;
import yskim.sample.dagger2example.dagger.ActivityComponent;
//import yskim.sample.dagger2example.dagger.DaggerActivityComponent;
import yskim.sample.dagger2example.dagger.DieselEngineModule;

public class MainActivity extends AppCompatActivity {

    //private Car car;
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CarComponent component = DaggerCarComponent.create();
        //ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent();
//        ActivityComponent component = DaggerActivityComponent.builder()
//                .horsePower(120)
//                .engineCapacity(1400)
//                .appComponent(((ExampleApp) getApplication()).getAppComponent())
//                .build();
        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent()
                .horsePower(150)
                .engineCapacity((1500))
                .build();

        component.inject(this);

        //car = component.getCar();
        car1.drive();
        car2.drive();
    }
}