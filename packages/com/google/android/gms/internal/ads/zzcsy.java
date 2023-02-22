package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcsy implements zzdwb<zzcsw> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzrr> zzeqj;
    private final zzdwo<zzddl> zzfck;

    public zzcsy(zzdwo<zzrr> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<Context> zzdwoVar3) {
        this.zzeqj = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzejy = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcsw(this.zzeqj.get(), this.zzfck.get(), this.zzejy.get());
    }
}
