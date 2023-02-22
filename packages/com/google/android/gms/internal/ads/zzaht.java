package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzaht implements Runnable {
    private final zzaha zzdad;

    private zzaht(zzaha zzahaVar) {
        this.zzdad = zzahaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzaha zzahaVar) {
        return new zzaht(zzahaVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdad.destroy();
    }
}
