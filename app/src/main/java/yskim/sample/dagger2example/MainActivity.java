package yskim.sample.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import yskim.sample.dagger2example.car.Car;
import yskim.sample.dagger2example.dagger.CarComponent;
import yskim.sample.dagger2example.dagger.DaggerCarComponent;
import yskim.sample.dagger2example.dagger.DieselEngineModule;

public class MainActivity extends AppCompatActivity {

    //private Car car;
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CarComponent component = DaggerCarComponent.create();
        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        component.inject(this);

        //car = component.getCar();
        car.drive();
    }
}