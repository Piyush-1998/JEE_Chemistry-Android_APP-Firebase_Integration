package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzfz implements Callable<byte[]> {
    private final /* synthetic */ zzai zzdm;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzfk zzph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfz(zzfk zzfkVar, zzai zzaiVar, String str) {
        this.zzph = zzfkVar;
        this.zzdm = zzaiVar;
        this.zzdn = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        return zzjgVar2.zzji().zzb(this.zzdm, this.zzdn);
    }
}
