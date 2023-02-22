package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdv extends zzce<Integer, Object> {
    public Long zzxo;
    public Boolean zzxp;
    public Boolean zzxq;

    public zzdv() {
    }

    public zzdv(String str) {
        zzan(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzxo = (Long) zzao.get(0);
            this.zzxp = (Boolean) zzao.get(1);
            this.zzxq = (Boolean) zzao.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzce
    protected final HashMap<Integer, Object> zzbw() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzxo);
        hashMap.put(1, this.zzxp);
        hashMap.put(2, this.zzxq);
        return hashMap;
    }
}
