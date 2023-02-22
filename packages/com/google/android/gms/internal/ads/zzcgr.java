package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcgr implements Runnable {
    private final zzbbw zzehv;

    private zzcgr(zzbbw zzbbwVar) {
        this.zzehv = zzbbwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzh(zzbbw zzbbwVar) {
        return new zzcgr(zzbbwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzehv.zzaac();
    }
}
