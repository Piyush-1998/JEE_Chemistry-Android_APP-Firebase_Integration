package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfx implements Runnable {
    private final /* synthetic */ zzai zzdm;
    private final /* synthetic */ zzn zzpg;
    private final /* synthetic */ zzfk zzph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfx(zzfk zzfkVar, zzai zzaiVar, zzn zznVar) {
        this.zzph = zzfkVar;
        this.zzdm = zzaiVar;
        this.zzpg = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzai zzb = this.zzph.zzb(this.zzdm, this.zzpg);
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        zzjgVar2.zzc(zzb, this.zzpg);
    }
}
