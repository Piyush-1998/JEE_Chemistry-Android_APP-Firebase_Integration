package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.zzxc;
import com.google.android.gms.internal.ads.zzxl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public class MobileAds {
    private MobileAds() {
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzxc.zzph().zza(context, str, settings == null ? null : settings.zzdd(), null);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class Settings {
        private final zzxl zzabh = new zzxl();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        final zzxl zzdd() {
            return this.zzabh;
        }
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzxc.zzph().zza(context, null, null, onInitializationCompleteListener);
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzxc.zzph().getRewardedVideoAdInstance(context);
    }

    public static void setAppVolume(float f) {
        zzxc.zzph().setAppVolume(f);
    }

    public static void setAppMuted(boolean z) {
        zzxc.zzph().setAppMuted(z);
    }

    public static void openDebugMenu(Context context, String str) {
        zzxc.zzph().openDebugMenu(context, str);
    }

    public static String getVersionString() {
        return zzxc.zzph().getVersionString();
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzxc.zzph().registerRtbAdapter(cls);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzxc.zzph().getInitializationStatus();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzxc.zzph().getRequestConfiguration();
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzxc.zzph().setRequestConfiguration(requestConfiguration);
    }
}
