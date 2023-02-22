package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhk implements Runnable {
    private final /* synthetic */ zzhj zzahd;
    private final /* synthetic */ zzgo zzahf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhk(zzhj zzhjVar, zzgo zzgoVar) {
        this.zzahd = zzhjVar;
        this.zzahf = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhg zzhgVar;
        zzhgVar = this.zzahd.zzahe;
        zzhgVar.zzb(this.zzahf);
    }
}
