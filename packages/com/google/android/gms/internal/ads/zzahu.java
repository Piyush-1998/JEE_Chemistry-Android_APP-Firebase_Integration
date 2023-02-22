package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzahu implements Runnable {
    private final /* synthetic */ zzaie zzdaa;
    private final /* synthetic */ zzaha zzdab;
    private final /* synthetic */ zzahn zzdac;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahu(zzahn zzahnVar, zzaie zzaieVar, zzaha zzahaVar) {
        this.zzdac = zzahnVar;
        this.zzdaa = zzaieVar;
        this.zzdab = zzahaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzdac.lock;
        synchronized (obj) {
            if (this.zzdaa.getStatus() != -1 && this.zzdaa.getStatus() != 1) {
                this.zzdaa.reject();
                zzddl zzddlVar = zzaxn.zzdwm;
                zzaha zzahaVar = this.zzdab;
                zzahaVar.getClass();
                zzddlVar.execute(zzahx.zzb(zzahaVar));
                zzaug.zzdy("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
