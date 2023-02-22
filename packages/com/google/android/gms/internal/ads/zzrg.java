package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrg {
    private final int orientation;
    private final zzwz zzaaz;
    private zzvl zzbqx;
    private final String zzbqy;
    private final AppOpenAd.AppOpenAdLoadCallback zzbqz;
    private final Context zzlk;
    private final zzaju zzbra = new zzaju();
    private final zzty zzaax = zzty.zzccl;

    public zzrg(Context context, String str, zzwz zzwzVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzlk = context;
        this.zzbqy = str;
        this.zzaaz = zzwzVar;
        this.orientation = i;
        this.zzbqz = appOpenAdLoadCallback;
    }

    public final void zzmg() {
        try {
            this.zzbqx = zzuv.zzok().zza(this.zzlk, zzua.zzob(), this.zzbqy, this.zzbra);
            this.zzbqx.zza(new zzuf(this.orientation));
            this.zzbqx.zza(new zzqu(this.zzbqz));
            this.zzbqx.zza(zzty.zza(this.zzlk, this.zzaaz));
        } catch (RemoteException e) {
            zzaxi.zze("#007 Could not call remote method.", e);
        }
    }
}
