package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzahz implements zzaxx {
    private final /* synthetic */ zzahn zzdac;
    private final /* synthetic */ zzaie zzdag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahz(zzahn zzahnVar, zzaie zzaieVar) {
        this.zzdac = zzahnVar;
        this.zzdag = zzaieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void run() {
        Object obj;
        obj = this.zzdac.lock;
        synchronized (obj) {
            this.zzdac.status = 1;
            zzaug.zzdy("Failed loading new engine. Marking new engine destroyable.");
            this.zzdag.zzri();
        }
    }
}
