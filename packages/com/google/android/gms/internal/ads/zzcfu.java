package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcfu implements zzdwb<zzcft> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcfp> zzemr;
    private final zzdwo<zzcfj> zzepb;
    private final zzdwo<zzddi<Bundle>> zzfwv;

    private zzcfu(zzdwo<Context> zzdwoVar, zzdwo<zzddi<Bundle>> zzdwoVar2, zzdwo<zzcfp> zzdwoVar3, zzdwo<zzcfj> zzdwoVar4) {
        this.zzejy = zzdwoVar;
        this.zzfwv = zzdwoVar2;
        this.zzemr = zzdwoVar3;
        this.zzepb = zzdwoVar4;
    }

    public static zzcfu zzc(zzdwo<Context> zzdwoVar, zzdwo<zzddi<Bundle>> zzdwoVar2, zzdwo<zzcfp> zzdwoVar3, zzdwo<zzcfj> zzdwoVar4) {
        return new zzcfu(zzdwoVar, zzdwoVar2, zzdwoVar3, zzdwoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcft(this.zzejy.get(), this.zzfwv.get(), this.zzemr.get(), this.zzepb.get());
    }
}
