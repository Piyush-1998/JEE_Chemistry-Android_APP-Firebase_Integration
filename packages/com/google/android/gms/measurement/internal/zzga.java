package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzga implements Callable<List<zzjp>> {
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzfk zzph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzga(zzfk zzfkVar, zzn zznVar) {
        this.zzph = zzfkVar;
        this.zzpg = zznVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzjp> call() throws Exception {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        return zzjgVar2.zzgy().zzaa(this.zzpg.packageName);
    }
}
