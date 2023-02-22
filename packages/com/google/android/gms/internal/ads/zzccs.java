package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzccs extends zzafs {
    private final /* synthetic */ zzccj zzfth;
    private final /* synthetic */ Object zzfti;
    private final /* synthetic */ String zzftj;
    private final /* synthetic */ long zzftk;
    private final /* synthetic */ zzaxv zzftl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccs(zzccj zzccjVar, Object obj, String str, long j, zzaxv zzaxvVar) {
        this.zzfth = zzccjVar;
        this.zzfti = obj;
        this.zzftj = str;
        this.zzftk = j;
        this.zzftl = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaft
    public final void onInitializationSucceeded() {
        zzcbt zzcbtVar;
        synchronized (this.zzfti) {
            this.zzfth.zza(this.zzftj, true, "", (int) (com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - this.zzftk));
            zzcbtVar = this.zzfth.zzfsz;
            zzcbtVar.zzfz(this.zzftj);
            this.zzftl.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaft
    public final void onInitializationFailed(String str) {
        zzcbt zzcbtVar;
        synchronized (this.zzfti) {
            this.zzfth.zza(this.zzftj, false, str, (int) (com.google.android.gms.ads.internal.zzq.zzkq().elapsedRealtime() - this.zzftk));
            zzcbtVar = this.zzfth.zzfsz;
            zzcbtVar.zzr(this.zzftj, "error");
            this.zzftl.set(false);
        }
    }
}
