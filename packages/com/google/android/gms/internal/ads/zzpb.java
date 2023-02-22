package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzpb implements Runnable {
    private final /* synthetic */ zzov zzbjg;
    private final /* synthetic */ Surface zzbjj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpb(zzov zzovVar, Surface surface) {
        this.zzbjg = zzovVar;
        this.zzbjj = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zzb(this.zzbjj);
    }
}
