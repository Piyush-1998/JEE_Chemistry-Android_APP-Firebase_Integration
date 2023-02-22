package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzblo implements zzdwb<zzatq> {
    private final zzdwo<zzatz> zzelw;
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzcwe> zzfef;

    private zzblo(zzdwo<Clock> zzdwoVar, zzdwo<zzatz> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3) {
        this.zzfco = zzdwoVar;
        this.zzelw = zzdwoVar2;
        this.zzfef = zzdwoVar3;
    }

    public static zzblo zzh(zzdwo<Clock> zzdwoVar, zzdwo<zzatz> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3) {
        return new zzblo(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzatq) zzdwh.zza(this.zzelw.get().zza(this.zzfco.get(), this.zzfef.get().zzgkh), "Cannot return null from a non-@Nullable @Provides method");
    }
}
