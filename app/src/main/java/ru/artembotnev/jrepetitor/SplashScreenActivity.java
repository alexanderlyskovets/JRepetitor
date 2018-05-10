package ru.artembotnev.jrepetitor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Application splash screen activity.
 * <p>
 * Create by Artem Botnev 06.05.18
 */
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(MainActivity.newIntent(this));
        finish();
    }
}