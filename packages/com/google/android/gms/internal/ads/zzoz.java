package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzoz implements Runnable {
    private final /* synthetic */ zzov zzbjg;
    private final /* synthetic */ int zzbjh;
    private final /* synthetic */ long zzbji;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoz(zzov zzovVar, int i, long j) {
        this.zzbjg = zzovVar;
        this.zzbjh = i;
        this.zzbji = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zzf(this.zzbjh, this.zzbji);
    }
}
