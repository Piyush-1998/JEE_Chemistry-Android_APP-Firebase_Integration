package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcni implements zzdwb<Set<String>> {
    private final zzcnc zzgdo;

    public zzcni(zzcnc zzcncVar) {
        this.zzgdo = zzcncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (Set) zzdwh.zza(this.zzgdo.zzals(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
