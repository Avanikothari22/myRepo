package com.awesomeproject.toast;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.awesomeproject.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashMap;
import java.util.Map;

import static android.widget.Toast.*;

/**
 * Created by macmini04 on 11/12/17.
 */

public class RNToastModule extends ReactContextBaseJavaModule {

    private final String DURATION_SHORT_KEY = "DURATION_SHORT_KEY";
    private final String DURATION_LONG_KEY = "DURATION_LONG_KEY";

    public RNToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }



    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, LENGTH_SHORT);
        constants.put(DURATION_LONG_KEY, LENGTH_LONG);
        return constants;
    }


    @Override
    public String getName() {
        return "RNToast";
    }

    @ReactMethod
    public void showToast(String toastMessage, int duration) {


    Toast toast = makeText(getReactApplicationContext(), toastMessage, duration);
        toast.setGravity(Gravity.TOP,50,100 );
        toast.show();


    }
}
