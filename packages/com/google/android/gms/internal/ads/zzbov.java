package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbov implements Runnable {
    private final WeakReference<zzbou> zzfhf;

    private zzbov(zzbou zzbouVar) {
        this.zzfhf = new WeakReference<>(zzbouVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbou zzbouVar = this.zzfhf.get();
        if (zzbouVar != null) {
            zzbou.zza(zzbouVar);
        }
    }
}
