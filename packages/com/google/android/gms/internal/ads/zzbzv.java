package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbzv implements zzbri {
    private final zzbbw zzehv;

    private zzbzv(zzbbw zzbbwVar) {
        this.zzehv = zzbbwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbri zzn(zzbbw zzbbwVar) {
        return new zzbzv(zzbbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzagr() {
        this.zzehv.destroy();
    }
}
