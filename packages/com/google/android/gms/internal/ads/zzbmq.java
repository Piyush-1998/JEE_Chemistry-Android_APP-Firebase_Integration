package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbmq implements zzdwb<Bundle> {
    private final zzbmk zzfgv;

    private zzbmq(zzbmk zzbmkVar) {
        this.zzfgv = zzbmkVar;
    }

    public static zzbmq zzh(zzbmk zzbmkVar) {
        return new zzbmq(zzbmkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return this.zzfgv.zzafw();
    }
}
