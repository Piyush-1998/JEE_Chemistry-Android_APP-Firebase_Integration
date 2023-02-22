package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcmp implements zzcms<zzbkk> {
    private final /* synthetic */ zzcmm zzgda;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmp(zzcmm zzcmmVar) {
        this.zzgda = zzcmmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzalq() {
        synchronized (this.zzgda) {
            this.zzgda.zzadc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final /* synthetic */ void onSuccess(zzbkk zzbkkVar) {
        zzbkk zzbkkVar2 = zzbkkVar;
        synchronized (this.zzgda) {
            this.zzgda.zzadc = false;
            this.zzgda.zzgct = zzbkkVar2.getMediationAdapterClassName();
            this.zzgda.zzgcu = zzbkkVar2.zzju();
            zzbkkVar2.zzafa();
        }
    }
}
