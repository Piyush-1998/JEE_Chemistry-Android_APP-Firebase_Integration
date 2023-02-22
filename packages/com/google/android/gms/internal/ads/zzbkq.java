package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbkq {
    public final List<? extends zzddi<? extends zzbkk>> zzffk;

    public zzbkq(List<? extends zzddi<? extends zzbkk>> list) {
        this.zzffk = list;
    }

    public zzbkq(zzbkk zzbkkVar) {
        this.zzffk = Collections.singletonList(zzdcy.zzah(zzbkkVar));
    }

    public static zzcga<zzbkq> zza(zzcih<? extends zzbkk> zzcihVar) {
        return new zzcgd(zzcihVar, zzbkt.zzdos);
    }

    public static zzcga<zzbkq> zza(zzcga<? extends zzbkk> zzcgaVar) {
        return new zzcgd(zzcgaVar, zzbks.zzdos);
    }
}
