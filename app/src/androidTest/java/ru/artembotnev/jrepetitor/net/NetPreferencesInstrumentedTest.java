package ru.artembotnev.jrepetitor.net;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

/**
 * Instrumented test of NetPreferences class
 * <p>
 * Created by Artem Botnev on 11.05.18
 */
@RunWith(AndroidJUnit4.class)
public class NetPreferencesInstrumentedTest {
    private static final String SERVER_URL = "server";
    private Context context;

    @Before
    public void contextInit() {
        context = InstrumentationRegistry.getContext();
    }

    @Test
    public void putAndGetServerUrlTest() {
        NetPreferences.putServerUrl(context, SERVER_URL);
        String result = NetPreferences.getServerUrl(context);

        assertEquals(SERVER_URL, result);

        NetPreferences.putServerUrl(context, "");
    }
}
