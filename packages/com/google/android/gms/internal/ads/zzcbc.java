package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcbc implements zzbnb, zzbog, zzbpc {
    private final zzcbl zzfru;
    private final zzcbo zzfrv;

    public zzcbc(zzcbl zzcblVar, zzcbo zzcboVar) {
        this.zzfru = zzcblVar;
        this.zzfrv = zzcboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void onAdLoaded() {
        this.zzfrv.zzm(this.zzfru.zzqd());
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void onAdFailedToLoad(int i) {
        this.zzfrv.zzm(this.zzfru.zzqd());
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzb(zzape zzapeVar) {
        this.zzfru.zzi(zzapeVar.zzdma);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zza(zzcvz zzcvzVar) {
        this.zzfru.zzb(zzcvzVar);
    }
}
