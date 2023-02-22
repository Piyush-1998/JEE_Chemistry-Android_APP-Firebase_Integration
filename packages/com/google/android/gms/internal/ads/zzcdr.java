package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzcdr implements zzdcj<zzape, zzcvz> {
    private final zzbox zzfun;

    public zzcdr(zzbox zzboxVar) {
        this.zzfun = zzboxVar;
    }

    protected abstract zzddi<zzcvz> zze(zzape zzapeVar) throws zzccu;

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final /* synthetic */ zzddi<zzcvz> zzf(zzape zzapeVar) throws Exception {
        zzape zzapeVar2 = zzapeVar;
        this.zzfun.zzb(zzapeVar2);
        zzddi<zzcvz> zze = zze(zzapeVar2);
        zzdcy.zza(zze, new zzcdq(this), zzaxn.zzdwn);
        return zze;
    }
}
