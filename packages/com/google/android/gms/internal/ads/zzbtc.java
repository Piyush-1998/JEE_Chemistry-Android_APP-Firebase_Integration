package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbtc implements zzdwb<zzbtd> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzasl> zzfaq;
    private final zzdwo<Integer> zzfcr;
    private final zzdwo<View> zzfdt;
    private final zzdwo<zzasm> zzffe;

    private zzbtc(zzdwo<zzasm> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzasl> zzdwoVar3, zzdwo<View> zzdwoVar4, zzdwo<Integer> zzdwoVar5) {
        this.zzffe = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzfaq = zzdwoVar3;
        this.zzfdt = zzdwoVar4;
        this.zzfcr = zzdwoVar5;
    }

    public static zzbtc zze(zzdwo<zzasm> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<zzasl> zzdwoVar3, zzdwo<View> zzdwoVar4, zzdwo<Integer> zzdwoVar5) {
        return new zzbtc(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4, zzdwoVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbtd(this.zzffe.get(), this.zzejy.get(), this.zzfaq.get(), this.zzfdt.get(), this.zzfcr.get().intValue());
    }
}
