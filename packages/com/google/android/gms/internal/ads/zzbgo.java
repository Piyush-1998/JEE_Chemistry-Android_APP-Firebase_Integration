package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgo implements zzdwb<zzatn> {
    private static final zzbgo zzfax = new zzbgo();

    public static zzbgo zzaed() {
        return zzfax;
    }

    public static zzatn zzaee() {
        return (zzatn) zzdwh.zza(new zzatl(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzaee();
    }
}
