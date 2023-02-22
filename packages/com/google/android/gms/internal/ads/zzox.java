package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzox implements Runnable {
    private final /* synthetic */ String zzahg;
    private final /* synthetic */ long zzahh;
    private final /* synthetic */ long zzahi;
    private final /* synthetic */ zzov zzbjg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzox(zzov zzovVar, String str, long j, long j2) {
        this.zzbjg = zzovVar;
        this.zzahg = str;
        this.zzahh = j;
        this.zzahi = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zzd(this.zzahg, this.zzahh, this.zzahi);
    }
}
