package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzhl implements Runnable {
    private final /* synthetic */ zzhj zzahd;
    private final /* synthetic */ String zzahg;
    private final /* synthetic */ long zzahh;
    private final /* synthetic */ long zzahi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhl(zzhj zzhjVar, String str, long j, long j2) {
        this.zzahd = zzhjVar;
        this.zzahg = str;
        this.zzahh = j;
        this.zzahi = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhg zzhgVar;
        zzhgVar = this.zzahd.zzahe;
        zzhgVar.zza(this.zzahg, this.zzahh, this.zzahi);
    }
}
