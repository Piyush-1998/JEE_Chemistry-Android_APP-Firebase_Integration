package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjb implements zzdwb<zzbkl> {
    private final zzbiv zzfec;

    public zzbjb(zzbiv zzbivVar) {
        this.zzfec = zzbivVar;
    }

    public static zzbkl zzc(zzbiv zzbivVar) {
        return (zzbkl) zzdwh.zza(zzbivVar.zzafc(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzc(this.zzfec);
    }
}
