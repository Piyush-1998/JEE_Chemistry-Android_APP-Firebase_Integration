package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjj implements Runnable {
    private final /* synthetic */ zzjg zztl;
    private final /* synthetic */ zzjm zztm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjj(zzjg zzjgVar, zzjm zzjmVar) {
        this.zztl = zzjgVar;
        this.zztm = zzjmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zztl.zza(this.zztm);
        this.zztl.start();
    }
}
