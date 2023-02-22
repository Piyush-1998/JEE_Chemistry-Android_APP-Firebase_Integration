package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfg implements zzdwb<zzcfh> {
    private final zzdwo<Context> zzejy;

    private zzcfg(zzdwo<Context> zzdwoVar) {
        this.zzejy = zzdwoVar;
    }

    public static zzcfg zzac(zzdwo<Context> zzdwoVar) {
        return new zzcfg(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcfh(this.zzejy.get());
    }
}
