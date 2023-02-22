package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhi implements Runnable {
    private final /* synthetic */ zzil zzahc;
    private final /* synthetic */ zzhj zzahd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhi(zzhj zzhjVar, zzil zzilVar) {
        this.zzahd = zzhjVar;
        this.zzahc = zzilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhg zzhgVar;
        zzhgVar = this.zzahd.zzahe;
        zzhgVar.zza(this.zzahc);
    }
}
