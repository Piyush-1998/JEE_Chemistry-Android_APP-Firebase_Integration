package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqn implements zzdwb<zzcql> {
    private final zzdwo<Context> zzejy;
    private final zzdwo<zzddl> zzfck;
    private final zzdwo<Set<String>> zzgeh;

    private zzcqn(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<Set<String>> zzdwoVar3) {
        this.zzfck = zzdwoVar;
        this.zzejy = zzdwoVar2;
        this.zzgeh = zzdwoVar3;
    }

    public static zzcqn zzp(zzdwo<zzddl> zzdwoVar, zzdwo<Context> zzdwoVar2, zzdwo<Set<String>> zzdwoVar3) {
        return new zzcqn(zzdwoVar, zzdwoVar2, zzdwoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return new zzcql(this.zzfck.get(), this.zzejy.get(), this.zzgeh.get());
    }
}
