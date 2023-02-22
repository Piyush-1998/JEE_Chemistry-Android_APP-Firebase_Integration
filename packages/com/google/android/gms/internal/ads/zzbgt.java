package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbgt implements zzdcj<zzcvz, zzcvz> {
    private Map<String, zzbgs> zzfba;

    public zzbgt(Map<String, zzbgs> map) {
        this.zzfba = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final /* synthetic */ zzddi<zzcvz> zzf(zzcvz zzcvzVar) throws Exception {
        zzcvz zzcvzVar2 = zzcvzVar;
        for (zzcwa zzcwaVar : zzcvzVar2.zzgkb.zzgjz) {
            if (this.zzfba.containsKey(zzcwaVar.name)) {
                this.zzfba.get(zzcwaVar.name).zzk(zzcwaVar.zzgkc);
            }
        }
        return zzdcy.zzah(zzcvzVar2);
    }
}
