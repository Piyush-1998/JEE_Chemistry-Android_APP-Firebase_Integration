package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcvg implements zzdwb<zzcvb> {
    private final zzdwo<zzbei> zzejx;
    private final zzdwo<zzcwc> zzeyy;
    private final zzdwo<Executor> zzfdx;
    private final zzdwo<Context> zzgim;
    private final zzdwo<zzcud<zzbzc, zzbyz>> zzgin;
    private final zzdwo<zzcui> zzgio;
    private final zzdwo<zzcwg> zzgip;

    public zzcvg(zzdwo<Context> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzbei> zzdwoVar3, zzdwo<zzcud<zzbzc, zzbyz>> zzdwoVar4, zzdwo<zzcui> zzdwoVar5, zzdwo<zzcwg> zzdwoVar6, zzdwo<zzcwc> zzdwoVar7) {
        this.zzgim = zzdwoVar;
        this.zzfdx = zzdwoVar2;
        this.zzejx = zzdwoVar3;
        this.zzgin = zzdwoVar4;
        this.zzgio = zzdwoVar5;
        this.zzgip = zzdwoVar6;
        this.zzeyy = zzdwoVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcvb(this.zzgim.get(), this.zzfdx.get(), this.zzejx.get(), this.zzgin.get(), this.zzgio.get(), this.zzgip.get(), this.zzeyy.get());
    }
}
