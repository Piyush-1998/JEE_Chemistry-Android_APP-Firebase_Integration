package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbwd implements zzdwb<zzbwa> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzbmv> zzesd;
    private final zzdwo<zzbni> zzesg;
    private final zzdwo<zzakm> zzetb;
    private final zzdwo<zzaxl> zzfan;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzcvr> zzfes;
    private final zzdwo<zzakg> zzfnt;
    private final zzdwo<zzakl> zzfnu;

    public zzbwd(zzdwo<zzakg> zzdwoVar, zzdwo<zzakl> zzdwoVar2, zzdwo<zzakm> zzdwoVar3, zzdwo<zzbni> zzdwoVar4, zzdwo<zzbmv> zzdwoVar5, zzdwo<Context> zzdwoVar6, zzdwo<zzcvr> zzdwoVar7, zzdwo<zzaxl> zzdwoVar8, zzdwo<zzcwe> zzdwoVar9) {
        this.zzfnt = zzdwoVar;
        this.zzfnu = zzdwoVar2;
        this.zzetb = zzdwoVar3;
        this.zzesg = zzdwoVar4;
        this.zzesd = zzdwoVar5;
        this.zzejy = zzdwoVar6;
        this.zzfes = zzdwoVar7;
        this.zzfan = zzdwoVar8;
        this.zzfef = zzdwoVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbwa(this.zzfnt.get(), this.zzfnu.get(), this.zzetb.get(), this.zzesg.get(), this.zzesd.get(), this.zzejy.get(), this.zzfes.get(), this.zzfan.get(), this.zzfef.get());
    }
}
