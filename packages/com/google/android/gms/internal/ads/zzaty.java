package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaty {
    private final String zzdro;
    private final zzaui zzdrp;
    private long zzdrj = -1;
    private long zzdrk = -1;
    private int zzdrl = -1;
    int zzdrm = -1;
    private long zzdrn = 0;
    private final Object lock = new Object();
    private int zzdrq = 0;
    private int zzdrr = 0;

    public zzaty(String str, zzaui zzauiVar) {
        this.zzdro = str;
        this.zzdrp = zzauiVar;
    }

    public final void zzty() {
        synchronized (this.lock) {
            this.zzdrq++;
        }
    }

    public final void zztx() {
        synchronized (this.lock) {
            this.zzdrr++;
        }
    }

    public final void zza(zztx zztxVar, long j) {
        synchronized (this.lock) {
            long zzvf = this.zzdrp.zzvf();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzkq().currentTimeMillis();
            if (this.zzdrk == -1) {
                if (currentTimeMillis - zzvf > ((Long) zzuv.zzon().zzd(zzza.zzcko)).longValue()) {
                    this.zzdrm = -1;
                } else {
                    this.zzdrm = this.zzdrp.zzvg();
                }
                this.zzdrk = j;
                this.zzdrj = j;
            } else {
                this.zzdrj = j;
            }
            if (zztxVar == null || zztxVar.extras == null || zztxVar.extras.getInt("gw", 2) != 1) {
                this.zzdrl++;
                int i = this.zzdrm + 1;
                this.zzdrm = i;
                if (i == 0) {
                    this.zzdrn = 0L;
                    this.zzdrp.zzeu(currentTimeMillis);
                } else {
                    this.zzdrn = currentTimeMillis - this.zzdrp.zzvh();
                }
            }
        }
    }

    public final Bundle zzo(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzdro);
            bundle.putLong("basets", this.zzdrk);
            bundle.putLong("currts", this.zzdrj);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdrl);
            bundle.putInt("preqs_in_session", this.zzdrm);
            bundle.putLong("time_in_session", this.zzdrn);
            bundle.putInt("pclick", this.zzdrq);
            bundle.putInt("pimp", this.zzdrr);
            bundle.putBoolean("support_transparent_background", zzam(context));
        }
        return bundle;
    }

    private static boolean zzam(Context context) {
        Context zzaa = zzapv.zzaa(context);
        int identifier = zzaa.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzaug.zzet("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzaa.getPackageManager().getActivityInfo(new ComponentName(zzaa.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzaug.zzet("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzaug.zzeu("Fail to fetch AdActivity theme");
            zzaug.zzet("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
