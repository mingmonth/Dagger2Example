package yskim.sample.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car - remote";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
