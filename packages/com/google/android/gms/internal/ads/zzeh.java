package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzeh extends zzce<Integer, Long> {
    public Long zzzm;
    public Long zzzn;
    public Long zzzo;
    public Long zzzp;

    public zzeh() {
    }

    public zzeh(String str) {
        zzan(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzzm = (Long) zzao.get(0);
            this.zzzn = (Long) zzao.get(1);
            this.zzzo = (Long) zzao.get(2);
            this.zzzp = (Long) zzao.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzce
    protected final HashMap<Integer, Long> zzbw() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzzm);
        hashMap.put(1, this.zzzn);
        hashMap.put(2, this.zzzo);
        hashMap.put(3, this.zzzp);
        return hashMap;
    }
}
