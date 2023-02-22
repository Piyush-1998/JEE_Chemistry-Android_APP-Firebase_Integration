package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzccz implements zzdcj {
    static final zzdcj zzbkv = new zzccz();

    private zzccz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final zzddi zzf(Object obj) {
        return zzdcy.zzi(((ExecutionException) obj).getCause());
    }
}
