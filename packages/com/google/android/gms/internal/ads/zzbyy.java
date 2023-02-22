package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbyy implements Runnable {
    private final zzbbw zzehv;

    private zzbyy(zzbbw zzbbwVar) {
        this.zzehv = zzbbwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzh(zzbbw zzbbwVar) {
        return new zzbyy(zzbbwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzehv.destroy();
    }
}
