package ru.artembotnev.jrepetitor.net;

import android.content.Context;

/**
 * Class for saving network settings
 * <p>
 * Created by Artem Botnev on 11.05.18
 */
public final class NetPreferences {
    // net preferences name
    private static final String NET_PREFERENCES = "net_pref";
    // key for server's url
    private static final String SERVER_URL = "server_url";

    /**
     * saves server url in preferences
     *
     * @param context current context
     * @param url     server url as String
     */
    public static void putServerUrl(Context context, String url) {
        put(context, SERVER_URL, url);
    }

    /**
     * gets server url form preferences
     *
     * @param context current context
     */
    public static String getServerUrl(Context context) {
        return get(context, SERVER_URL);
    }

    private static void put(Context context, String key, String value) {
        context.getSharedPreferences(NET_PREFERENCES, Context.MODE_PRIVATE)
                .edit()
                .putString(key, value)
                .apply();
    }

    private static String get(Context context, String key) {
        return context.getSharedPreferences(NET_PREFERENCES, Context.MODE_PRIVATE)
                .getString(key, "");
    }
}
