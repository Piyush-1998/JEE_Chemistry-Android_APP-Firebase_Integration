package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbav implements Runnable {
    private final /* synthetic */ zzbaw zzedd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbav(zzbaw zzbawVar) {
        this.zzedd = zzbawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzq.zzlf().zzb(this.zzedd);
    }
}
