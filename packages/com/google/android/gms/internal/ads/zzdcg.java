package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdce;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdcg implements Runnable {
    private final /* synthetic */ int zzgqx;
    private final /* synthetic */ zzddi zzgqy;
    private final /* synthetic */ zzdce.zza zzgqz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdcg(zzdce.zza zzaVar, int i, zzddi zzddiVar) {
        this.zzgqz = zzaVar;
        this.zzgqx = i;
        this.zzgqy = zzddiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzgqz.zza(this.zzgqx, this.zzgqy);
        } finally {
            this.zzgqz.zzapa();
        }
    }
}
