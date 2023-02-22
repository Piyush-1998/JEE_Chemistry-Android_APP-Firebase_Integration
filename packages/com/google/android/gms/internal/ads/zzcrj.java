package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrj implements zzdwb<zzcrh> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzasl> zzfaq;
    private final zzdwo<zzddl> zzfck;

    private zzcrj(zzdwo<zzasl> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<Context> zzdwoVar3) {
        this.zzfaq = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzejy = zzdwoVar3;
    }

    public static zzcrj zzq(zzdwo<zzasl> zzdwoVar, zzdwo<zzddl> zzdwoVar2, zzdwo<Context> zzdwoVar3) {
        return new zzcrj(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcrh(this.zzfaq.get(), this.zzfck.get(), this.zzejy.get());
    }
}
