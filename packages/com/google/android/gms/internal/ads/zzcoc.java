package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcoc implements zzdwb<zzcoa> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcpd<zzcrx>> zzelb;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<zzatr> zzgeg;

    private zzcoc(zzdwo<zzcpd<zzcrx>> zzdwoVar, zzdwo<zzcwe> zzdwoVar2, zzdwo<Context> zzdwoVar3, zzdwo<zzatr> zzdwoVar4) {
        this.zzelb = zzdwoVar;
        this.zzfef = zzdwoVar2;
        this.zzejy = zzdwoVar3;
        this.zzgeg = zzdwoVar4;
    }

    public static zzcoc zze(zzdwo<zzcpd<zzcrx>> zzdwoVar, zzdwo<zzcwe> zzdwoVar2, zzdwo<Context> zzdwoVar3, zzdwo<zzatr> zzdwoVar4) {
        return new zzcoc(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcoa(this.zzelb.get(), this.zzfef.get(), this.zzejy.get(), this.zzgeg.get());
    }
}
