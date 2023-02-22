package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzben implements zzdwb<WeakReference<Context>> {
    private final zzbel zzejv;

    public zzben(zzbel zzbelVar) {
        this.zzejv = zzbelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwo
    public final /* synthetic */ Object get() {
        return (WeakReference) zzdwh.zza(this.zzejv.zzabq(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
