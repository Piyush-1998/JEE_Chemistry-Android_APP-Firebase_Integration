package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfy implements Runnable {
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzfk zzph;
    private final /* synthetic */ zzjn zzpi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfy(zzfk zzfkVar, zzjn zzjnVar, zzn zznVar) {
        this.zzph = zzfkVar;
        this.zzpi = zzjnVar;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        zzjgVar2.zzc(this.zzpi, this.zzpg);
    }
}
