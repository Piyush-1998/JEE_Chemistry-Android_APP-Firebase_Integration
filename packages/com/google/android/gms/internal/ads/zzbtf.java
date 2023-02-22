package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbtf implements zzbkp<zzbkq> {
    private final zzbuy zzfdo;
    private final Map<String, zzcga<zzbkq>> zzffj;
    private final zzdwo<zzbkp<zzbio>> zzfjb;
    private final Map<String, zzcga<zzbuj>> zzfjc;
    private final Map<String, zzcih<zzbuj>> zzfjd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtf(Map<String, zzcga<zzbkq>> map, Map<String, zzcga<zzbuj>> map2, Map<String, zzcih<zzbuj>> map3, zzdwo<zzbkp<zzbio>> zzdwoVar, zzbuy zzbuyVar) {
        this.zzffj = map;
        this.zzfjc = map2;
        this.zzfjd = map3;
        this.zzfjb = zzdwoVar;
        this.zzfdo = zzbuyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final zzcga<zzbkq> zze(int i, String str) {
        zzcga<zzbio> zze;
        zzcga<zzbkq> zzcgaVar = this.zzffj.get(str);
        if (zzcgaVar != null) {
            return zzcgaVar;
        }
        if (i == 1) {
            if (this.zzfdo.zzaih() == null || (zze = this.zzfjb.get().zze(i, str)) == null) {
                return null;
            }
            return zzbkq.zza(zze);
        } else if (i != 4) {
            return null;
        } else {
            zzcih<zzbuj> zzcihVar = this.zzfjd.get(str);
            if (zzcihVar != null) {
                return zzbkq.zza((zzcih<? extends zzbkk>) zzcihVar);
            }
            zzcga<zzbuj> zzcgaVar2 = this.zzfjc.get(str);
            if (zzcgaVar2 != null) {
                return zzbkq.zza(zzcgaVar2);
            }
            return null;
        }
    }
}
