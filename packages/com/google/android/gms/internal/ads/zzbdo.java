package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbdo implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzasi zzefc;
    private final /* synthetic */ int zzefe;
    private final /* synthetic */ zzbdm zzeib;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdo(zzbdm zzbdmVar, View view, zzasi zzasiVar, int i) {
        this.zzeib = zzbdmVar;
        this.val$view = view;
        this.zzefc = zzasiVar;
        this.zzefe = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeib.zza(this.val$view, this.zzefc, this.zzefe - 1);
    }
}
