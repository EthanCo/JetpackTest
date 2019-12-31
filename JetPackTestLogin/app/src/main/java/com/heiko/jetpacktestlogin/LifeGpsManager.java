package com.heiko.jetpacktestlogin;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * LifeGpsManager
 *
 * @author Heiko
 * @date 2019/12/31
 */
public class LifeGpsManager implements DefaultLifecycleObserver {
    private LifeGpsManager() {
    }

    private static LifeGpsManager instance = null;

    public static LifeGpsManager getInstance() {
        if (instance == null) {
            synchronized (LifeGpsManager.class) {
                if (instance == null) {
                    instance = new LifeGpsManager();
                }
            }
        }
        return instance;
    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {

    }
}
