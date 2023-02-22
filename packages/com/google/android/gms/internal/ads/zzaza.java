package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzaza implements Runnable {
    private final /* synthetic */ zzayw zzdyr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaza(zzayw zzaywVar) {
        this.zzdyr = zzaywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdyr.zzd("surfaceDestroyed", new String[0]);
    }
}
