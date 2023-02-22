package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzft implements Callable<List<zzjp>> {
    private final /* synthetic */ String zzas;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzfk zzph;
    private final /* synthetic */ String zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzft(zzfk zzfkVar, String str, String str2, String str3) {
        this.zzph = zzfkVar;
        this.zzdn = str;
        this.zzx = str2;
        this.zzas = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzjp> call() throws Exception {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        return zzjgVar2.zzgy().zza(this.zzdn, this.zzx, this.zzas);
    }
}
