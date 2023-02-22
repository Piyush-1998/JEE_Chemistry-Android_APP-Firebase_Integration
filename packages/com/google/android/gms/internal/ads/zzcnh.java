package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnh implements zzdwb<zzddi<zzcnl>> {
    private final zzdwo<zzcyg> zzfek;
    private final zzdwo<zzddi<zzape>> zzffz;
    private final zzdwo<zzcnk> zzgdp;

    public zzcnh(zzdwo<zzcyg> zzdwoVar, zzdwo<zzcnk> zzdwoVar2, zzdwo<zzddi<zzape>> zzdwoVar3) {
        this.zzfek = zzdwoVar;
        this.zzgdp = zzdwoVar2;
        this.zzffz = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzddi) zzdwh.zza(this.zzfek.get().zza((zzcyg) zzcyd.GENERATE_SIGNALS, (zzddi) this.zzffz.get()).zza(this.zzgdp.get()).zza(((Integer) zzuv.zzon().zzd(zzza.zzcrq)).intValue(), TimeUnit.SECONDS).zzant(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
