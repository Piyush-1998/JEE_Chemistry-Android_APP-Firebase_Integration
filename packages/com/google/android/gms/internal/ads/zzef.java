package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzef extends zzce<Integer, Long> {
    public Long zzyq;
    public Long zzyr;
    public Long zzys;
    public Long zzyt;
    public Long zzyu;
    public Long zzyv;
    public Long zzyw;
    public Long zzyx;
    public Long zzyy;
    public Long zzyz;
    public Long zzza;

    public zzef() {
    }

    public zzef(String str) {
        zzan(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzyq = (Long) zzao.get(0);
            this.zzyr = (Long) zzao.get(1);
            this.zzys = (Long) zzao.get(2);
            this.zzyt = (Long) zzao.get(3);
            this.zzyu = (Long) zzao.get(4);
            this.zzyv = (Long) zzao.get(5);
            this.zzyw = (Long) zzao.get(6);
            this.zzyx = (Long) zzao.get(7);
            this.zzyy = (Long) zzao.get(8);
            this.zzyz = (Long) zzao.get(9);
            this.zzza = (Long) zzao.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzce
    protected final HashMap<Integer, Long> zzbw() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzyq);
        hashMap.put(1, this.zzyr);
        hashMap.put(2, this.zzys);
        hashMap.put(3, this.zzyt);
        hashMap.put(4, this.zzyu);
        hashMap.put(5, this.zzyv);
        hashMap.put(6, this.zzyw);
        hashMap.put(7, this.zzyx);
        hashMap.put(8, this.zzyy);
        hashMap.put(9, this.zzyz);
        hashMap.put(10, this.zzza);
        return hashMap;
    }
}
