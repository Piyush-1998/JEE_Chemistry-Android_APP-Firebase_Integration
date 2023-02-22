package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzayz implements Runnable {
    private final /* synthetic */ zzayw zzdyr;
    private final /* synthetic */ boolean zzdyu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayz(zzayw zzaywVar, boolean z) {
        this.zzdyr = zzaywVar;
        this.zzdyu = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdyr.zzd("windowVisibilityChanged", "isVisible", String.valueOf(this.zzdyu));
    }
}
