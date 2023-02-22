package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbud implements zzdwb<zzbqv> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzcvr> zzfes;

    public zzbud(zzdwo<Context> zzdwoVar, zzdwo<zzcvr> zzdwoVar2) {
        this.zzejy = zzdwoVar;
        this.zzfes = zzdwoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (zzbqv) zzdwh.zza(new zzbqv(this.zzejy.get(), new HashSet(), this.zzfes.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
