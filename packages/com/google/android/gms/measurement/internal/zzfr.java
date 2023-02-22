package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfr implements Runnable {
    private final /* synthetic */ zzq zzpf;
    private final /* synthetic */ zzfk zzph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfr(zzfk zzfkVar, zzq zzqVar) {
        this.zzph = zzfkVar;
        this.zzpf = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        zzjgVar2.zze(this.zzpf);
    }
}
