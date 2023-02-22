package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbfr implements zzcvj {
    private final /* synthetic */ zzbfa zzerq;
    private zzdwo<Context> zzeyv;
    private zzdwo<zzcud<zzbzc, zzbyz>> zzeyw;
    private zzdwo<zzcui> zzeyx;
    private zzdwo<zzcwc> zzeyy;
    private zzdwo<zzcvb> zzeyz;
    private zzdwo<zzcvl> zzeza;
    private zzdwo<String> zzezb;
    private zzdwo<zzcvf> zzezc;

    private zzbfr(zzbfa zzbfaVar, Context context, String str) {
        zzdwo zzdwoVar;
        zzdwo zzdwoVar2;
        this.zzerq = zzbfaVar;
        zzdwb zzbb = zzdwe.zzbb(context);
        this.zzeyv = zzbb;
        this.zzeyw = new zzcug(zzbb);
        this.zzeyx = zzdwc.zzan(zzcuz.zzamu());
        this.zzeyy = zzdwc.zzan(zzcwb.zzamz());
        zzdwo<Context> zzdwoVar3 = this.zzeyv;
        zzdwoVar = this.zzerq.zzekc;
        zzdwoVar2 = this.zzerq.zzejx;
        zzdwo<zzcvb> zzan = zzdwc.zzan(new zzcvg(zzdwoVar3, zzdwoVar, zzdwoVar2, this.zzeyw, this.zzeyx, zzcwf.zzanb(), this.zzeyy));
        this.zzeyz = zzan;
        this.zzeza = zzdwc.zzan(new zzcvq(zzan, this.zzeyx, this.zzeyy));
        zzdwb zzbc = zzdwe.zzbc(str);
        this.zzezb = zzbc;
        this.zzezc = zzdwc.zzan(new zzcvk(zzbc, this.zzeyz, this.zzeyx, this.zzeyy));
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final zzcvl zzadk() {
        return this.zzeza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final zzcvf zzadl() {
        return this.zzezc.get();
    }
}
