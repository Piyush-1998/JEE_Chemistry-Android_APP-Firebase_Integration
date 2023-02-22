package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbyo implements com.google.android.gms.ads.internal.overlay.zzt {
    private final zzbnr zzfpx;

    private zzbyo(zzbnr zzbnrVar) {
        this.zzfpx = zzbnrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.ads.internal.overlay.zzt zza(zzbnr zzbnrVar) {
        return new zzbyo(zzbnrVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzsy() {
        this.zzfpx.onAdLeftApplication();
    }
}
