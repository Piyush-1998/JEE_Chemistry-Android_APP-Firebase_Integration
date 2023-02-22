package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzoy implements Runnable {
    private final /* synthetic */ zzil zzahc;
    private final /* synthetic */ zzov zzbjg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoy(zzov zzovVar, zzil zzilVar) {
        this.zzbjg = zzovVar;
        this.zzahc = zzilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zze(this.zzahc);
    }
}
