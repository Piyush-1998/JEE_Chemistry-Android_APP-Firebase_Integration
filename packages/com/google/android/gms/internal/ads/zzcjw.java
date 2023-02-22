package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcjw implements Runnable {
    private final zzcab zzfyk;

    private zzcjw(zzcab zzcabVar) {
        this.zzfyk = zzcabVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcab zzcabVar) {
        return new zzcjw(zzcabVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzfyk.zzajm();
    }
}
