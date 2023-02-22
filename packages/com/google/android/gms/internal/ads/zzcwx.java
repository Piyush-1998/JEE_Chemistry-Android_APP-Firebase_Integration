package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcwx implements zzdwb<zzcww> {
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<Context> zzfgo;
    private final zzdwo<zzatr> zzgeg;

    public zzcwx(zzdwo<Context> zzdwoVar, zzdwo<zzaxl> zzdwoVar2, zzdwo<zzatr> zzdwoVar3) {
        this.zzfgo = zzdwoVar;
        this.zzfcq = zzdwoVar2;
        this.zzgeg = zzdwoVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcww(this.zzfgo.get(), this.zzfcq.get(), this.zzgeg.get());
    }
}
