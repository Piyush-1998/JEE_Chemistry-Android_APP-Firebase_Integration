package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzfq implements Callable<List<zzjp>> {
    private final /* synthetic */ String zzas;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzfk zzph;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfq(zzfk zzfkVar, zzn zznVar, String str, String str2) {
        this.zzph = zzfkVar;
        this.zzpg = zznVar;
        this.zzx = str;
        this.zzas = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzjp> call() throws Exception {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        return zzjgVar2.zzgy().zza(this.zzpg.packageName, this.zzx, this.zzas);
    }
}
