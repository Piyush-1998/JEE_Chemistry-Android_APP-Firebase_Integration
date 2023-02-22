package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjk implements Callable<String> {
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzjg zztl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjk(zzjg zzjgVar, zzn zznVar) {
        this.zztl = zzjgVar;
        this.zzpg = zznVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzf zzg;
        zzg = this.zztl.zzg(this.zzpg);
        if (zzg == null) {
            this.zztl.zzab().zzgn().zzao("App info was null when attempting to get app instance id");
            return null;
        }
        return zzg.getAppInstanceId();
    }
}
