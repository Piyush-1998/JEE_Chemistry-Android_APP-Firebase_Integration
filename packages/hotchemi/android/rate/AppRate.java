package hotchemi.android.rate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Date;

/* loaded from: classes.dex */
public final class AppRate {
    private static AppRate singleton;
    private final Context context;
    private final DialogOptions options = new DialogOptions();
    private int installDate = 10;
    private int launchTimes = 10;
    private int remindInterval = 1;
    private boolean isDebug = false;

    private AppRate(Context context) {
        this.context = context.getApplicationContext();
    }

    public static AppRate with(Context context) {
        if (singleton == null) {
            synchronized (AppRate.class) {
                if (singleton == null) {
                    singleton = new AppRate(context);
                }
            }
        }
        return singleton;
    }

    public static boolean showRateDialogIfMeetsConditions(Activity activity) {
        AppRate appRate = singleton;
        boolean z = appRate.isDebug || appRate.shouldShowRateDialog();
        if (z) {
            singleton.showRateDialog(activity);
        }
        return z;
    }

    private static boolean isOverDate(long j, int i) {
        return new Date().getTime() - j >= ((long) ((((i * 24) * 60) * 60) * 1000));
    }

    public AppRate setLaunchTimes(int i) {
        this.launchTimes = i;
        return this;
    }

    public AppRate setInstallDays(int i) {
        this.installDate = i;
        return this;
    }

    public AppRate setRemindInterval(int i) {
        this.remindInterval = i;
        return this;
    }

    public AppRate setShowLaterButton(boolean z) {
        this.options.setShowNeutralButton(z);
        return this;
    }

    public AppRate setShowNeverButton(boolean z) {
        this.options.setShowNegativeButton(z);
        return this;
    }

    public AppRate setShowTitle(boolean z) {
        this.options.setShowTitle(z);
        return this;
    }

    public AppRate clearAgreeShowDialog() {
        PreferenceHelper.setAgreeShowDialog(this.context, true);
        return this;
    }

    public AppRate clearSettingsParam() {
        PreferenceHelper.setAgreeShowDialog(this.context, true);
        PreferenceHelper.clearSharedPreferences(this.context);
        return this;
    }

    public AppRate setAgreeShowDialog(boolean z) {
        PreferenceHelper.setAgreeShowDialog(this.context, z);
        return this;
    }

    public AppRate setView(View view) {
        this.options.setView(view);
        return this;
    }

    public AppRate setOnClickButtonListener(OnClickButtonListener onClickButtonListener) {
        this.options.setListener(onClickButtonListener);
        return this;
    }

    public AppRate setTitle(int i) {
        this.options.setTitleResId(i);
        return this;
    }

    public AppRate setTitle(String str) {
        this.options.setTitleText(str);
        return this;
    }

    public AppRate setMessage(int i) {
        this.options.setMessageResId(i);
        return this;
    }

    public AppRate setMessage(String str) {
        this.options.setMessageText(str);
        return this;
    }

    public AppRate setTextRateNow(int i) {
        this.options.setTextPositiveResId(i);
        return this;
    }

    public AppRate setTextRateNow(String str) {
        this.options.setPositiveText(str);
        return this;
    }

    public AppRate setTextLater(int i) {
        this.options.setTextNeutralResId(i);
        return this;
    }

    public AppRate setTextLater(String str) {
        this.options.setNeutralText(str);
        return this;
    }

    public AppRate setTextNever(int i) {
        this.options.setTextNegativeResId(i);
        return this;
    }

    public AppRate setTextNever(String str) {
        this.options.setNegativeText(str);
        return this;
    }

    public AppRate setCancelable(boolean z) {
        this.options.setCancelable(z);
        return this;
    }

    public AppRate setStoreType(StoreType storeType) {
        this.options.setStoreType(storeType);
        return this;
    }

    public void monitor() {
        if (PreferenceHelper.isFirstLaunch(this.context)) {
            PreferenceHelper.setInstallDate(this.context);
        }
        Context context = this.context;
        PreferenceHelper.setLaunchTimes(context, PreferenceHelper.getLaunchTimes(context) + 1);
    }

    public void showRateDialog(Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        DialogManager.create(activity, this.options).show();
    }

    public boolean shouldShowRateDialog() {
        return PreferenceHelper.getIsAgreeShowDialog(this.context) && isOverLaunchTimes() && isOverInstallDate() && isOverRemindDate();
    }

    private boolean isOverLaunchTimes() {
        return PreferenceHelper.getLaunchTimes(this.context) >= this.launchTimes;
    }

    private boolean isOverInstallDate() {
        return isOverDate(PreferenceHelper.getInstallDate(this.context), this.installDate);
    }

    private boolean isOverRemindDate() {
        return isOverDate(PreferenceHelper.getRemindInterval(this.context), this.remindInterval);
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public AppRate setDebug(boolean z) {
        this.isDebug = z;
        return this;
    }
}
