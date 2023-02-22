package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbbz implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzasi zzefc;
    private final /* synthetic */ zzbbv zzefd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbz(zzbbv zzbbvVar, zzasi zzasiVar) {
        this.zzefd = zzbbvVar;
        this.zzefc = zzasiVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzefd.zza(view, this.zzefc, 10);
    }
}
