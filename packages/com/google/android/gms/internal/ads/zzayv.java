package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzayv implements Runnable {
    private final zzayu zzdxz;

    private zzayv(zzayu zzayuVar) {
        this.zzdxz = zzayuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzayu zzayuVar) {
        return new zzayv(zzayuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdxz.stop();
    }
}
