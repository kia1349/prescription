package edu.unsis.prescription.opening;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Meltsan on 28/10/17.
 */
public class MyApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
