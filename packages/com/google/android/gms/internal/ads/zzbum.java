package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbum implements zzdwb<zzbuj> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzbkn> zzesy;
    private final zzdwo<zzbuz> zzetd;
    private final zzdwo<zzbuv> zzete;
    private final zzdwo<zzbup> zzeth;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzbuy> zzfdw;
    private final zzdwo<zzasm> zzffe;
    private final zzdwo<zzbur> zzfkg;
    private final zzdwo<zzdf> zzfkh;
    private final zzdwo<zzbvj> zzflb;
    private final zzdwo<zzbxz> zzflc;
    private final zzdwo<zzbxx> zzfld;
    private final zzdwo<zzbyc> zzfle;
    private final zzdwo<zzbxs> zzflf;
    private final zzdwo<zzbyb> zzflg;

    private zzbum(zzdwo<zzbkn> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzbur> zzdwoVar3, zzdwo<zzbuz> zzdwoVar4, zzdwo<zzbvj> zzdwoVar5, zzdwo<zzbuv> zzdwoVar6, zzdwo<zzbuy> zzdwoVar7, zzdwo<zzbxz> zzdwoVar8, zzdwo<zzbxx> zzdwoVar9, zzdwo<zzbyc> zzdwoVar10, zzdwo<zzbxs> zzdwoVar11, zzdwo<zzbyb> zzdwoVar12, zzdwo<zzasm> zzdwoVar13, zzdwo<zzdf> zzdwoVar14, zzdwo<zzaxl> zzdwoVar15, zzdwo<Context> zzdwoVar16, zzdwo<zzbup> zzdwoVar17) {
        this.zzesy = zzdwoVar;
        this.zzfck = zzdwoVar2;
        this.zzfkg = zzdwoVar3;
        this.zzetd = zzdwoVar4;
        this.zzflb = zzdwoVar5;
        this.zzete = zzdwoVar6;
        this.zzfdw = zzdwoVar7;
        this.zzflc = zzdwoVar8;
        this.zzfld = zzdwoVar9;
        this.zzfle = zzdwoVar10;
        this.zzflf = zzdwoVar11;
        this.zzflg = zzdwoVar12;
        this.zzffe = zzdwoVar13;
        this.zzfkh = zzdwoVar14;
        this.zzfan = zzdwoVar15;
        this.zzejy = zzdwoVar16;
        this.zzeth = zzdwoVar17;
    }

    public static zzbum zza(zzdwo<zzbkn> zzdwoVar, zzdwo<Executor> zzdwoVar2, zzdwo<zzbur> zzdwoVar3, zzdwo<zzbuz> zzdwoVar4, zzdwo<zzbvj> zzdwoVar5, zzdwo<zzbuv> zzdwoVar6, zzdwo<zzbuy> zzdwoVar7, zzdwo<zzbxz> zzdwoVar8, zzdwo<zzbxx> zzdwoVar9, zzdwo<zzbyc> zzdwoVar10, zzdwo<zzbxs> zzdwoVar11, zzdwo<zzbyb> zzdwoVar12, zzdwo<zzasm> zzdwoVar13, zzdwo<zzdf> zzdwoVar14, zzdwo<zzaxl> zzdwoVar15, zzdwo<Context> zzdwoVar16, zzdwo<zzbup> zzdwoVar17) {
        return new zzbum(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7, zzdwoVar8, zzdwoVar9, zzdwoVar10, zzdwoVar11, zzdwoVar12, zzdwoVar13, zzdwoVar14, zzdwoVar15, zzdwoVar16, zzdwoVar17);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbuj(this.zzesy.get(), this.zzfck.get(), this.zzfkg.get(), this.zzetd.get(), this.zzflb.get(), this.zzete.get(), this.zzfdw.get(), zzdwc.zzao(this.zzflc), zzdwc.zzao(this.zzfld), zzdwc.zzao(this.zzfle), zzdwc.zzao(this.zzflf), zzdwc.zzao(this.zzflg), this.zzffe.get(), this.zzfkh.get(), this.zzfan.get(), this.zzejy.get(), this.zzeth.get());
    }
}
