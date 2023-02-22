package hotchemi.android.rate;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes.dex */
final class PreferenceHelper {
    private static final String PREF_FILE_NAME = "android_rate_pref_file";
    private static final String PREF_KEY_INSTALL_DATE = "android_rate_install_date";
    private static final String PREF_KEY_IS_AGREE_SHOW_DIALOG = "android_rate_is_agree_show_dialog";
    private static final String PREF_KEY_LAUNCH_TIMES = "android_rate_launch_times";
    private static final String PREF_KEY_REMIND_INTERVAL = "android_rate_remind_interval";

    private PreferenceHelper() {
    }

    static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_FILE_NAME, 0);
    }

    static SharedPreferences.Editor getPreferencesEditor(Context context) {
        return getPreferences(context).edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void clearSharedPreferences(Context context) {
        SharedPreferences.Editor preferencesEditor = getPreferencesEditor(context);
        preferencesEditor.remove(PREF_KEY_INSTALL_DATE);
        preferencesEditor.remove(PREF_KEY_LAUNCH_TIMES);
        preferencesEditor.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setAgreeShowDialog(Context context, boolean z) {
        SharedPreferences.Editor preferencesEditor = getPreferencesEditor(context);
        preferencesEditor.putBoolean(PREF_KEY_IS_AGREE_SHOW_DIALOG, z);
        preferencesEditor.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getIsAgreeShowDialog(Context context) {
        return getPreferences(context).getBoolean(PREF_KEY_IS_AGREE_SHOW_DIALOG, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setRemindInterval(Context context) {
        SharedPreferences.Editor preferencesEditor = getPreferencesEditor(context);
        preferencesEditor.remove(PREF_KEY_REMIND_INTERVAL);
        preferencesEditor.putLong(PREF_KEY_REMIND_INTERVAL, new Date().getTime());
        preferencesEditor.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getRemindInterval(Context context) {
        return getPreferences(context).getLong(PREF_KEY_REMIND_INTERVAL, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setInstallDate(Context context) {
        SharedPreferences.Editor preferencesEditor = getPreferencesEditor(context);
        preferencesEditor.putLong(PREF_KEY_INSTALL_DATE, new Date().getTime());
        preferencesEditor.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getInstallDate(Context context) {
        return getPreferences(context).getLong(PREF_KEY_INSTALL_DATE, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLaunchTimes(Context context, int i) {
        SharedPreferences.Editor preferencesEditor = getPreferencesEditor(context);
        preferencesEditor.putInt(PREF_KEY_LAUNCH_TIMES, i);
        preferencesEditor.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getLaunchTimes(Context context) {
        return getPreferences(context).getInt(PREF_KEY_LAUNCH_TIMES, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isFirstLaunch(Context context) {
        return getPreferences(context).getLong(PREF_KEY_INSTALL_DATE, 0L) == 0;
    }
}
