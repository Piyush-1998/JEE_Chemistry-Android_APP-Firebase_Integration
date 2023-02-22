package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbqt implements zzdwb<zzbqo> {
    private final zzdwo<Set<zzbqs<zzbqp>>> zzfed;

    private zzbqt(zzdwo<Set<zzbqs<zzbqp>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    public static zzbqt zzr(zzdwo<Set<zzbqs<zzbqp>>> zzdwoVar) {
        return new zzbqt(zzdwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbqo(this.zzfed.get());
    }
}
