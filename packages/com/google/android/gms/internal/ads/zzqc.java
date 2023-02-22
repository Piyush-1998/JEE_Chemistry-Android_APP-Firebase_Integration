package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzqc implements Runnable {
    private final /* synthetic */ zzpz zzbpy;
    private final /* synthetic */ View zzbpz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqc(zzpz zzpzVar, View view) {
        this.zzbpy = zzpzVar;
        this.zzbpz = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbpy.zzi(this.zzbpz);
    }
}
