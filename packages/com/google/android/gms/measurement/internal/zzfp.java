package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfp implements Runnable {
    private final /* synthetic */ zzq zzpf;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzfk zzph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzfk zzfkVar, zzq zzqVar, zzn zznVar) {
        this.zzph = zzfkVar;
        this.zzpf = zzqVar;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        zzjgVar2.zzb(this.zzpf, this.zzpg);
    }
}
