package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbtu implements zzdwb<zzbtq> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcyp> zzepi;
    private final zzdwo<zzbmv> zzesd;
    private final zzdwo<zzbni> zzesg;
    private final zzdwo<JSONObject> zzetu;
    private final zzdwo<zzbhk> zzeua;
    private final zzdwo<zzbqv> zzeuj;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzbuy> zzfdw;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzcvr> zzfes;
    private final zzdwo<zzbyh> zzfkf;
    private final zzdwo<zzbur> zzfkg;
    private final zzdwo<zzdf> zzfkh;
    private final zzdwo<zzbvm> zzfki;

    public zzbtu(zzdwo<Context> zzdwoVar, zzdwo<zzbuy> zzdwoVar2, zzdwo<JSONObject> zzdwoVar3, zzdwo<zzbyh> zzdwoVar4, zzdwo<zzbur> zzdwoVar5, zzdwo<zzdf> zzdwoVar6, zzdwo<zzbni> zzdwoVar7, zzdwo<zzbmv> zzdwoVar8, zzdwo<zzcvr> zzdwoVar9, zzdwo<zzaxl> zzdwoVar10, zzdwo<zzcwe> zzdwoVar11, zzdwo<zzbhk> zzdwoVar12, zzdwo<zzbvm> zzdwoVar13, zzdwo<Clock> zzdwoVar14, zzdwo<zzbqv> zzdwoVar15, zzdwo<zzcyp> zzdwoVar16) {
        this.zzejy = zzdwoVar;
        this.zzfdw = zzdwoVar2;
        this.zzetu = zzdwoVar3;
        this.zzfkf = zzdwoVar4;
        this.zzfkg = zzdwoVar5;
        this.zzfkh = zzdwoVar6;
        this.zzesg = zzdwoVar7;
        this.zzesd = zzdwoVar8;
        this.zzfes = zzdwoVar9;
        this.zzfan = zzdwoVar10;
        this.zzfef = zzdwoVar11;
        this.zzeua = zzdwoVar12;
        this.zzfki = zzdwoVar13;
        this.zzfco = zzdwoVar14;
        this.zzeuj = zzdwoVar15;
        this.zzepi = zzdwoVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbtq(this.zzejy.get(), this.zzfdw.get(), this.zzetu.get(), this.zzfkf.get(), this.zzfkg.get(), this.zzfkh.get(), this.zzesg.get(), this.zzesd.get(), this.zzfes.get(), this.zzfan.get(), this.zzfef.get(), this.zzeua.get(), this.zzfki.get(), this.zzfco.get(), this.zzeuj.get(), this.zzepi.get());
    }
}
