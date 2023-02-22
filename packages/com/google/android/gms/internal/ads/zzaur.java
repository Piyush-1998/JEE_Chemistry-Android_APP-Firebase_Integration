package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzaur {
    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public boolean isAttachedToWindow(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean zza(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzbc(Context context) {
    }

    public void zzg(Activity activity) {
    }

    public int zzvq() {
        return 5;
    }

    public int zzvt() {
        return 1;
    }

    public long zzvu() {
        return -1L;
    }

    public boolean zza(final Context context, final WebSettings webSettings) {
        zzawq.zza(context, new Callable(context, webSettings) { // from class: com.google.android.gms.internal.ads.zzauu
            private final Context zzdpy;
            private final WebSettings zzdtc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdpy = context;
                this.zzdtc = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.zzdpy;
                WebSettings webSettings2 = this.zzdtc;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                webSettings2.setAllowContentAccess(false);
                return true;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public static boolean zza(zzbbw zzbbwVar) {
        if (zzbbwVar == null) {
            return false;
        }
        zzbbwVar.onPause();
        return true;
    }

    public static boolean zzb(zzbbw zzbbwVar) {
        if (zzbbwVar == null) {
            return false;
        }
        zzbbwVar.onResume();
        return true;
    }

    public zzbbv zza(zzbbw zzbbwVar, zzsd zzsdVar, boolean z) {
        return new zzbcv(zzbbwVar, zzsdVar, z);
    }

    public ViewGroup.LayoutParams zzvr() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static boolean zzvs() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public CookieManager zzbd(Context context) {
        if (zzvs()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaug.zzc("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public zzsv zza(Context context, TelephonyManager telephonyManager) {
        return zzsv.ENUM_UNKNOWN;
    }

    public int zza(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzb(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private zzaur() {
    }

    public static zzaur zzco(int i) {
        if (i >= 28) {
            return new zzavc();
        }
        if (i >= 26) {
            return new zzauz();
        }
        if (i >= 24) {
            return new zzava();
        }
        if (i >= 21) {
            return new zzaux();
        }
        if (i >= 19) {
            return new zzauy();
        }
        if (i >= 18) {
            return new zzauv();
        }
        if (i >= 17) {
            return new zzauw();
        }
        return new zzaur();
    }
}
