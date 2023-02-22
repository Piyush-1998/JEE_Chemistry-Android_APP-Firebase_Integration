package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbko<AdT> implements zzbkp<AdT> {
    private final Map<String, zzcga<AdT>> zzffj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbko(Map<String, zzcga<AdT>> map) {
        this.zzffj = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final zzcga<AdT> zze(int i, String str) {
        return this.zzffj.get(str);
    }
}
