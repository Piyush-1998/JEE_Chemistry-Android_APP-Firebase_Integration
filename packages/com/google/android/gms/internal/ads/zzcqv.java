package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqv implements zzdwb<zzcqt> {
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<Bundle> zzgfo;

    private zzcqv(zzdwo<zzddl> zzdwoVar, zzdwo<Bundle> zzdwoVar2) {
        this.zzfck = zzdwoVar;
        this.zzgfo = zzdwoVar2;
    }

    public static zzcqv zzar(zzdwo<zzddl> zzdwoVar, zzdwo<Bundle> zzdwoVar2) {
        return new zzcqv(zzdwoVar, zzdwoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcqt(this.zzfck.get(), this.zzgfo.get());
    }
}
