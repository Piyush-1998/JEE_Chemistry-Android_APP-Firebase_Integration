package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzpa implements Runnable {
    private final /* synthetic */ zzgo zzahf;
    private final /* synthetic */ zzov zzbjg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpa(zzov zzovVar, zzgo zzgoVar) {
        this.zzbjg = zzovVar;
        this.zzahf = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzow zzowVar;
        zzowVar = this.zzbjg.zzbjf;
        zzowVar.zzk(this.zzahf);
    }
}
