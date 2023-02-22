package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzpc implements Runnable {
    private final /* synthetic */ zzov zzbjg;
    private final /* synthetic */ int zzbjk;
    private final /* synthetic */ int zzbjl;
    private final /* synthetic */ int zzbjm;
    private final /* synthetic */ float zzbjn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpc(zzov zzovVar, int i, int i2, int i3, float f) {
        this.zzbjg = zzovVar;
        this.zzbjk = i;
        this.zzbjl = i2;
        this.zzbjm = i3;
        this.zzbjn = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zzb(this.zzbjk, this.zzbjl, this.zzbjm, this.zzbjn);
    }
}
