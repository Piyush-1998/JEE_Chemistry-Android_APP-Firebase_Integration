package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhm implements Runnable {
    private final /* synthetic */ zzhj zzahd;
    private final /* synthetic */ zzil zzahj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhm(zzhj zzhjVar, zzil zzilVar) {
        this.zzahd = zzhjVar;
        this.zzahj = zzilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhg zzhgVar;
        this.zzahj.zzfy();
        zzhgVar = this.zzahd.zzahe;
        zzhgVar.zzb(this.zzahj);
    }
}
