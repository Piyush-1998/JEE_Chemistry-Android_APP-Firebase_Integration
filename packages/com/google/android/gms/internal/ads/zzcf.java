package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcf extends zzce<Integer, Object> {
    public String zzno;
    public long zznp;
    public String zznq;
    public String zznr;
    public String zzns;

    public zzcf(String str) {
        this();
        zzan(str);
    }

    public zzcf() {
        this.zzno = "E";
        this.zznp = -1L;
        this.zznq = "E";
        this.zznr = "E";
        this.zzns = "E";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzce
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzno = zzao.get(0) == null ? "E" : (String) zzao.get(0);
            this.zznp = zzao.get(1) == null ? -1L : ((Long) zzao.get(1)).longValue();
            this.zznq = zzao.get(2) == null ? "E" : (String) zzao.get(2);
            this.zznr = zzao.get(3) == null ? "E" : (String) zzao.get(3);
            this.zzns = zzao.get(4) != null ? (String) zzao.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzce
    protected final HashMap<Integer, Object> zzbw() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzno);
        hashMap.put(4, this.zzns);
        hashMap.put(3, this.zznr);
        hashMap.put(2, this.zznq);
        hashMap.put(1, Long.valueOf(this.zznp));
        return hashMap;
    }
}
