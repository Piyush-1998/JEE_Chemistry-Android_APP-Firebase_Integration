package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbis implements zzdwb<zzbiq> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzbqw> zzesk;
    private final zzdwo<zzbkn> zzesy;
    private final zzdwo<zzclw> zzexk;
    private final zzdwo<zzcvu> zzfds;
    private final zzdwo<View> zzfdt;
    private final zzdwo<zzbbw> zzfdu;
    private final zzdwo<zzbkl> zzfdv;
    private final zzdwo<zzbuy> zzfdw;
    private final zzdwo<Executor> zzfdx;

    public zzbis(zzdwo<zzbkn> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzcvu> zzdwoVar3, zzdwo<View> zzdwoVar4, zzdwo<zzbbw> zzdwoVar5, zzdwo<zzbkl> zzdwoVar6, zzdwo<zzbuy> zzdwoVar7, zzdwo<zzbqw> zzdwoVar8, zzdwo<zzclw> zzdwoVar9, zzdwo<Executor> zzdwoVar10) {
        this.zzesy = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfds = zzdwoVar3;
        this.zzfdt = zzdwoVar4;
        this.zzfdu = zzdwoVar5;
        this.zzfdv = zzdwoVar6;
        this.zzfdw = zzdwoVar7;
        this.zzesk = zzdwoVar8;
        this.zzexk = zzdwoVar9;
        this.zzfdx = zzdwoVar10;
    }

    public static zzbiq zza(zzbkn zzbknVar, Context context, zzcvu zzcvuVar, View view, zzbbw zzbbwVar, zzbkl zzbklVar, zzbuy zzbuyVar, zzbqw zzbqwVar, zzdvv<zzclw> zzdvvVar, Executor executor) {
        return new zzbiq(zzbknVar, context, zzcvuVar, view, zzbbwVar, zzbklVar, zzbuyVar, zzbqwVar, zzdvvVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbiq(this.zzesy.get(), this.zzejy.get(), this.zzfds.get(), this.zzfdt.get(), this.zzfdu.get(), this.zzfdv.get(), this.zzfdw.get(), this.zzesk.get(), zzdwc.zzao(this.zzexk), this.zzfdx.get());
    }
}
