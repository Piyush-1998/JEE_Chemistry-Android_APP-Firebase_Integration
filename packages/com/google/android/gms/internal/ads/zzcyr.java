package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcyr implements zzdwb<zzcyp> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzaxm> zzekp;
    private final zzdwo<zzcwc> zzeyy;
    private final zzdwo<Executor> zzfck;
    private final zzdwo<Clock> zzfco;
    private final zzdwo<zzaxl> zzfcq;
    private final zzdwo<String> zzger;
    private final zzdwo<String> zzges;
    private final zzdwo<zzcjf> zzgmz;

    private zzcyr(zzdwo<Executor> zzdwoVar, zzdwo<zzaxm> zzdwoVar2, zzdwo<zzcjf> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4, zzdwo<String> zzdwoVar5, zzdwo<String> zzdwoVar6, zzdwo<Context> zzdwoVar7, zzdwo<zzcwc> zzdwoVar8, zzdwo<Clock> zzdwoVar9) {
        this.zzfck = zzdwoVar;
        this.zzekp = zzdwoVar2;
        this.zzgmz = zzdwoVar3;
        this.zzfcq = zzdwoVar4;
        this.zzger = zzdwoVar5;
        this.zzges = zzdwoVar6;
        this.zzejy = zzdwoVar7;
        this.zzeyy = zzdwoVar8;
        this.zzfco = zzdwoVar9;
    }

    public static zzcyr zzc(zzdwo<Executor> zzdwoVar, zzdwo<zzaxm> zzdwoVar2, zzdwo<zzcjf> zzdwoVar3, zzdwo<zzaxl> zzdwoVar4, zzdwo<String> zzdwoVar5, zzdwo<String> zzdwoVar6, zzdwo<Context> zzdwoVar7, zzdwo<zzcwc> zzdwoVar8, zzdwo<Clock> zzdwoVar9) {
        return new zzcyr(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5, zzdwoVar6, zzdwoVar7, zzdwoVar8, zzdwoVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcyp(this.zzfck.get(), this.zzekp.get(), this.zzgmz.get(), this.zzfcq.get(), this.zzger.get(), this.zzges.get(), this.zzejy.get(), this.zzeyy.get(), this.zzfco.get());
    }
}
