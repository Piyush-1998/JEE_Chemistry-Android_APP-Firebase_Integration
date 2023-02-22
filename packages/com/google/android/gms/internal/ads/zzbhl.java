package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbhl implements zzdwb<zzbhi> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzpe> zzfcc;

    private zzbhl(zzdwo<Context> zzdwoVar, zzdwo<zzpe> zzdwoVar2) {
        this.zzejy = zzdwoVar;
        this.zzfcc = zzdwoVar2;
    }

    public static zzbhl zza(zzdwo<Context> zzdwoVar, zzdwo<zzpe> zzdwoVar2) {
        return new zzbhl(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbhi(this.zzejy.get(), this.zzfcc.get());
    }
}
