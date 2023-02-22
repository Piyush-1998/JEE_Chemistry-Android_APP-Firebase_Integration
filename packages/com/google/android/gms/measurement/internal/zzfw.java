package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfw implements Runnable {
    private final /* synthetic */ zzai zzdm;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzfk zzph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfw(zzfk zzfkVar, zzai zzaiVar, String str) {
        this.zzph = zzfkVar;
        this.zzdm = zzaiVar;
        this.zzdn = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        zzjgVar = this.zzph.zzkz;
        zzjgVar.zzjq();
        zzjgVar2 = this.zzph.zzkz;
        zzjgVar2.zzd(this.zzdm, this.zzdn);
    }
}
