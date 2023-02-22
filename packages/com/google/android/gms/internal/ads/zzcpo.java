package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpo implements zzdwb<zzcpk> {
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<Context> zzfgo;

    private zzcpo(zzdwo<Context> zzdwoVar, zzdwo<zzddl> zzdwoVar2) {
        this.zzfgo = zzdwoVar;
        this.zzfck = zzdwoVar2;
    }

    public static zzcpo zzan(zzdwo<Context> zzdwoVar, zzdwo<zzddl> zzdwoVar2) {
        return new zzcpo(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcpk(this.zzfgo.get(), this.zzfck.get());
    }
}
