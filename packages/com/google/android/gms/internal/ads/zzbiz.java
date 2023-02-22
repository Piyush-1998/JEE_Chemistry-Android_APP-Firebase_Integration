package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbiz implements zzdwb<View> {
    private final zzbiv zzfec;

    public zzbiz(zzbiv zzbivVar) {
        this.zzfec = zzbivVar;
    }

    public static View zzb(zzbiv zzbivVar) {
        return (View) zzdwh.zza(zzbivVar.zzaeu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return zzb(this.zzfec);
    }
}
