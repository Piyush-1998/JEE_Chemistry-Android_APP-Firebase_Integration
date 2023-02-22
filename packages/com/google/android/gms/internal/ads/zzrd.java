package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzrd extends AppOpenAd {
    private final zzqw zzbqw;

    public zzrd(zzqw zzqwVar) {
        this.zzbqw = zzqwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final zzvl zzdg() {
        try {
            return this.zzbqw.zzdg();
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void zza(zzrc zzrcVar) {
        try {
            this.zzbqw.zza(zzrcVar);
        } catch (RemoteException e) {
            zzaxi.zzc("", e);
        }
    }
}
