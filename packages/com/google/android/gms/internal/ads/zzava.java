package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzava extends zzaux {
    @Override // com.google.android.gms.internal.ads.zzaur
    public final boolean zza(Activity activity, Configuration configuration) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqh)).booleanValue()) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcqj)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            zzuv.zzoj();
            int zza = zzawy.zza(activity, configuration.screenHeightDp);
            int zza2 = zzawy.zza(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzq.zzkj();
            DisplayMetrics zza3 = zzaul.zza((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zza3.heightPixels;
            int i2 = zza3.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d = activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d);
            int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzuv.zzon().zzd(zzza.zzcqg)).intValue();
            return !(zze(i, zza + dimensionPixelSize, round) && zze(i2, zza2, round));
        }
        return false;
    }

    private static boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
