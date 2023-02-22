package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqf implements zzdwb<zzbpn> {
    private final zzbpn zzfhv;

    private zzbqf(zzbpn zzbpnVar) {
        this.zzfhv = zzbpnVar;
    }

    public static zzbqf zzv(zzbpn zzbpnVar) {
        return new zzbqf(zzbpnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        zzbpn zzbpnVar = this.zzfhv;
        if (zzbpnVar != null) {
            return (zzbpn) zzdwh.zza(zzbpnVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
