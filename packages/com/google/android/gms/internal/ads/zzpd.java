package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzpd implements Runnable {
    private final /* synthetic */ zzil zzahj;
    private final /* synthetic */ zzov zzbjg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpd(zzov zzovVar, zzil zzilVar) {
        this.zzbjg = zzovVar;
        this.zzahj = zzilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        this.zzahj.zzfy();
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zzf(this.zzahj);
    }
}
