package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcrf implements zzdwb<zzcrc> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzclr> zzekl;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<String> zzfcr;
    private final zzdwo<zzcwe> zzfef;
    private final zzdwo<ScheduledExecutorService> zzfoz;
    private final zzdwo<zzclp> zzgah;

    private zzcrf(zzdwo<zzddl> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<String> zzdwoVar3, zzdwo<zzclr> zzdwoVar4, zzdwo<Context> zzdwoVar5, zzdwo<zzcwe> zzdwoVar6, zzdwo<zzclp> zzdwoVar7) {
        this.zzfck = zzdwoVar;
        this.zzfoz = zzdwoVar2;
        this.zzfcr = zzdwoVar3;
        this.zzekl = zzdwoVar4;
        this.zzejy = zzdwoVar5;
        this.zzfef = zzdwoVar6;
        this.zzgah = zzdwoVar7;
    }

    public static zzcrf zza(zzdwo<zzddl> zzdwoVar, zzdwo<ScheduledExecutorService> zzdwoVar2, zzdwo<String> zzdwoVar3, zzdwo<zzclr> zzdwoVar4, zzdwo<Context> zzdwoVar5, zzdwo<zzcwe> zzdwoVar6, zzdwo<zzclp> zzdwoVar7) {
        return new zzcrf(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcrc(this.zzfck.get(), this.zzfoz.get(), this.zzfcr.get(), this.zzekl.get(), this.zzejy.get(), this.zzfef.get(), this.zzgah.get());
    }
}
