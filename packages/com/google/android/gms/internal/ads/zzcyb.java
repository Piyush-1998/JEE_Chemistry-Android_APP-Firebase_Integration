package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzcyb implements zzdcz<O> {
    private final /* synthetic */ zzcxp zzglw;
    private final /* synthetic */ zzcxy zzglx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyb(zzcxy zzcxyVar, zzcxp zzcxpVar) {
        this.zzglx = zzcxyVar;
        this.zzglw = zzcxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void onSuccess(O o) {
        zzcxs.zzc(this.zzglx.zzglr).zzc(this.zzglw);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzb(Throwable th) {
        zzcxs.zzc(this.zzglx.zzglr).zza(this.zzglw, th);
    }
}
