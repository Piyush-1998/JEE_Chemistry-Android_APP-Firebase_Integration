package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdy extends zzce<Integer, Long> {
    public Long zzyh;
    public Long zzyi;

    public zzdy() {
    }

    public zzdy(String str) {
        zzan(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzyh = (Long) zzao.get(0);
            this.zzyi = (Long) zzao.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzce
    protected final HashMap<Integer, Long> zzbw() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzyh);
        hashMap.put(1, this.zzyi);
        return hashMap;
    }
}
