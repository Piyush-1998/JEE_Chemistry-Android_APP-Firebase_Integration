package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbzw implements zzdwb<zzbzn> {
    private final zzdwo<zzbpf> zzerj;
    private final zzdwo<zzbof> zzerp;
    private final zzdwo<zzbnr> zzesa;
    private final zzdwo<zzbmv> zzesd;
    private final zzdwo<zzboo> zzesr;
    private final zzdwo<zzbhk> zzeua;
    private final zzdwo<zzbqv> zzeuj;
    private final zzdwo<zzbpb> zzevq;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<zzasi> zzfgm;
    private final zzdwo<zzdf> zzfkh;
    private final zzdwo<com.google.android.gms.ads.internal.zzc> zzfqs;
    private final zzdwo<zzbnl> zzfqt;

    private zzbzw(zzdwo<zzbmv> zzdwoVar, zzdwo<zzbnr> zzdwoVar2, zzdwo<zzbof> zzdwoVar3, zzdwo<zzboo> zzdwoVar4, zzdwo<zzbpf> zzdwoVar5, zzdwo<Executor> zzdwoVar6, zzdwo<zzbqv> zzdwoVar7, zzdwo<zzbhk> zzdwoVar8, zzdwo<com.google.android.gms.ads.internal.zzc> zzdwoVar9, zzdwo<zzbnl> zzdwoVar10, zzdwo<zzasi> zzdwoVar11, zzdwo<zzdf> zzdwoVar12, zzdwo<zzbpb> zzdwoVar13) {
        this.zzesd = zzdwoVar;
        this.zzesa = zzdwoVar2;
        this.zzerp = zzdwoVar3;
        this.zzesr = zzdwoVar4;
        this.zzerj = zzdwoVar5;
        this.zzfck = zzdwoVar6;
        this.zzeuj = zzdwoVar7;
        this.zzeua = zzdwoVar8;
        this.zzfqs = zzdwoVar9;
        this.zzfqt = zzdwoVar10;
        this.zzfgm = zzdwoVar11;
        this.zzfkh = zzdwoVar12;
        this.zzevq = zzdwoVar13;
    }

    public static zzbzw zza(zzdwo<zzbmv> zzdwoVar, zzdwo<zzbnr> zzdwoVar2, zzdwo<zzbof> zzdwoVar3, zzdwo<zzboo> zzdwoVar4, zzdwo<zzbpf> zzdwoVar5, zzdwo<Executor> zzdwoVar6, zzdwo<zzbqv> zzdwoVar7, zzdwo<zzbhk> zzdwoVar8, zzdwo<com.google.android.gms.ads.internal.zzc> zzdwoVar9, zzdwo<zzbnl> zzdwoVar10, zzdwo<zzasi> zzdwoVar11, zzdwo<zzdf> zzdwoVar12, zzdwo<zzbpb> zzdwoVar13) {
        return new zzbzw(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7, zzdwoVar8, zzdwoVar9, zzdwoVar10, zzdwoVar11, zzdwoVar12, zzdwoVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbzn(this.zzesd.get(), this.zzesa.get(), this.zzerp.get(), this.zzesr.get(), this.zzerj.get(), this.zzfck.get(), this.zzeuj.get(), this.zzeua.get(), this.zzfqs.get(), this.zzfqt.get(), this.zzfgm.get(), this.zzfkh.get(), this.zzevq.get());
    }
}
