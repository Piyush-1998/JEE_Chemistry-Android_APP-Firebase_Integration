package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzclv implements zzdwb<zzclr> {
    private final zzdwo<Executor> zzfck;

    public zzclv(zzdwo<Executor> zzdwoVar) {
        this.zzfck = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzclr(this.zzfck.get());
    }
}
