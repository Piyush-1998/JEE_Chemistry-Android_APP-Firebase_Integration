package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdj extends zzce<Integer, Long> {
    public long zzxe;
    public long zzxf;

    public zzdj() {
        this.zzxe = -1L;
        this.zzxf = -1L;
    }

    public zzdj(String str) {
        this();
        zzan(str);
    }

    @Override // com.google.android.gms.internal.ads.zzce
    protected final HashMap<Integer, Long> zzbw() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zzxe));
        hashMap.put(1, Long.valueOf(this.zzxf));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzxe = ((Long) zzao.get(0)).longValue();
            this.zzxf = ((Long) zzao.get(1)).longValue();
        }
    }
}
