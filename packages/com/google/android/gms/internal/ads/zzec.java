package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzec implements Runnable {
    private final /* synthetic */ zzdx zzyj;
    private final /* synthetic */ int zzym;
    private final /* synthetic */ boolean zzyn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzdx zzdxVar, int i, boolean z) {
        this.zzyj = zzdxVar;
        this.zzym = i;
        this.zzyn = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza;
        zzbo.zza zzb = this.zzyj.zzb(this.zzym, this.zzyn);
        this.zzyj.zzxy = zzb;
        zza = zzdx.zza(this.zzym, zzb);
        if (zza) {
            this.zzyj.zza(this.zzym + 1, this.zzyn);
        }
    }
}
