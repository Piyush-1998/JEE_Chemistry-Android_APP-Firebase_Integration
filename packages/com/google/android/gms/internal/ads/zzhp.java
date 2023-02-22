package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhp implements Runnable {
    private final /* synthetic */ zzhj zzahd;
    private final /* synthetic */ int zzajp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhp(zzhj zzhjVar, int i) {
        this.zzahd = zzhjVar;
        this.zzajp = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhg zzhgVar;
        zzhgVar = this.zzahd.zzahe;
        zzhgVar.zzq(this.zzajp);
    }
}
