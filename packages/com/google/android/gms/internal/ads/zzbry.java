package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbry implements zzdwb<View> {
    private final zzbrx zzfin;

    private zzbry(zzbrx zzbrxVar) {
        this.zzfin = zzbrxVar;
    }

    public static zzbry zza(zzbrx zzbrxVar) {
        return new zzbry(zzbrxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return this.zzfin.zzagv();
    }
}
