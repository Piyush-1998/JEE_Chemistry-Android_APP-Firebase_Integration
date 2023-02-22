package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsz implements zzdwb<zzcsx> {
    private final zzdwo<Context> zzfgo;

    public zzcsz(zzdwo<Context> zzdwoVar) {
        this.zzfgo = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcsx(this.zzfgo.get());
    }
}
