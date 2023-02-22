package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbjy implements zzdwb<Runnable> {
    private final zzbjz zzfer;

    public zzbjy(zzbjz zzbjzVar) {
        this.zzfer = zzbjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Runnable) zzdwh.zza(this.zzfer.zzafi(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
