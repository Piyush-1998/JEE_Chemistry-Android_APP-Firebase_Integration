package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzayx implements Runnable {
    private final /* synthetic */ zzayw zzdyr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayx(zzayw zzaywVar) {
        this.zzdyr = zzaywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdyr.zzd("surfaceCreated", new String[0]);
    }
}
