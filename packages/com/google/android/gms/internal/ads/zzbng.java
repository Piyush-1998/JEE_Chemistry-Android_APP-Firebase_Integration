package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbng implements zzdwb<zzbne> {
    private final zzdwo<Set<zzbqs<zzbnf>>> zzfed;

    public zzbng(zzdwo<Set<zzbqs<zzbnf>>> zzdwoVar) {
        this.zzfed = zzdwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzbne(this.zzfed.get());
    }
}
