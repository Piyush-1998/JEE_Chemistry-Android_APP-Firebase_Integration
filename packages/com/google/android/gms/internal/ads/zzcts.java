package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcts implements zzdwb<String> {
    private final zzctp zzghp;

    public zzcts(zzctp zzctpVar) {
        this.zzghp = zzctpVar;
    }

    public static String zzc(zzctp zzctpVar) {
        return (String) zzdwh.zza(zzctpVar.zzaml(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzc(this.zzghp);
    }
}
