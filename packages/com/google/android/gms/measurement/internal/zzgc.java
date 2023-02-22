package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgc implements Runnable {
    private final /* synthetic */ String zzax;
    private final /* synthetic */ String zzdn;
    private final /* synthetic */ zzfk zzph;
    private final /* synthetic */ String zzpj;
    private final /* synthetic */ long zzpk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzfk zzfkVar, String str, String str2, String str3, long j) {
        this.zzph = zzfkVar;
        this.zzpj = str;
        this.zzdn = str2;
        this.zzax = str3;
        this.zzpk = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar;
        zzjg zzjgVar2;
        if (this.zzpj != null) {
            zzhr zzhrVar = new zzhr(this.zzax, this.zzpj, this.zzpk);
            zzjgVar = this.zzph.zzkz;
            zzjgVar.zzjt().zzt().zza(this.zzdn, zzhrVar);
            return;
        }
        zzjgVar2 = this.zzph.zzkz;
        zzjgVar2.zzjt().zzt().zza(this.zzdn, (zzhr) null);
    }
}
