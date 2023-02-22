package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzags extends zzbdv {
    private final /* synthetic */ zzagm zzcza;

    private zzags(zzagm zzagmVar) {
        this.zzcza = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdv
    public final void zza(zzbdy zzbdyVar) {
        if (zzagm.zza(this.zzcza) != null) {
            zzagm.zza(this.zzcza).zzre();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdv
    public final void zzb(zzbdy zzbdyVar) {
        this.zzcza.zzg(zzbdyVar.uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbdv
    public final boolean zzc(zzbdy zzbdyVar) {
        return this.zzcza.zzg(zzbdyVar.uri);
    }
}
