package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzahx implements Runnable {
    private final zzaha zzdad;

    private zzahx(zzaha zzahaVar) {
        this.zzdad = zzahaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzaha zzahaVar) {
        return new zzahx(zzahaVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdad.destroy();
    }
}
