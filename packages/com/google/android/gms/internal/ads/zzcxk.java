package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcxk implements zzdwb<zzddl> {
    private static final zzcxk zzglh = new zzcxk();

    public static zzcxk zzanm() {
        return zzglh;
    }

    public static zzddl zzann() {
        return (zzddl) zzdwh.zza(zzaxn.zzdwi, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzann();
    }
}
