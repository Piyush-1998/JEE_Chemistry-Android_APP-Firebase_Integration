package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcnp implements zzdwb<zzcnn> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<ViewGroup> zzfzd;
    private final zzdwo<zzddl> zzgdx;

    public zzcnp(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzcwe> zzdwoVar3, zzdwo<ViewGroup> zzdwoVar4) {
        this.zzgdx = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfef = zzdwoVar3;
        this.zzfzd = zzdwoVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcnn(this.zzgdx.get(), this.zzejy.get(), this.zzfef.get(), this.zzfzd.get());
    }
}
