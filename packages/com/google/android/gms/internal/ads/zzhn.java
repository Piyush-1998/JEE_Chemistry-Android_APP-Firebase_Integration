package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhn implements Runnable {
    private final /* synthetic */ zzhj zzahd;
    private final /* synthetic */ int zzahk;
    private final /* synthetic */ long zzahl;
    private final /* synthetic */ long zzahm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhn(zzhj zzhjVar, int i, long j, long j2) {
        this.zzahd = zzhjVar;
        this.zzahk = i;
        this.zzahl = j;
        this.zzahm = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhg zzhgVar;
        zzhgVar = this.zzahd.zzahe;
        zzhgVar.zza(this.zzahk, this.zzahl, this.zzahm);
    }
}
