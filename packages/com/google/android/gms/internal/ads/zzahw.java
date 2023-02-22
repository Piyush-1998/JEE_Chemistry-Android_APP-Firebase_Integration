package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzahw implements zzaxz<zzaha> {
    private final /* synthetic */ zzahn zzdac;
    private final /* synthetic */ zzaie zzdag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahw(zzahn zzahnVar, zzaie zzaieVar) {
        this.zzdac = zzahnVar;
        this.zzdag = zzaieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final /* synthetic */ void zzh(zzaha zzahaVar) {
        Object obj;
        zzaie zzaieVar;
        zzaie zzaieVar2;
        zzaie zzaieVar3;
        obj = this.zzdac.lock;
        synchronized (obj) {
            this.zzdac.status = 0;
            zzaieVar = this.zzdac.zzczw;
            if (zzaieVar != null) {
                zzaie zzaieVar4 = this.zzdag;
                zzaieVar2 = this.zzdac.zzczw;
                if (zzaieVar4 != zzaieVar2) {
                    zzaug.zzdy("New JS engine is loaded, marking previous one as destroyable.");
                    zzaieVar3 = this.zzdac.zzczw;
                    zzaieVar3.zzri();
                }
            }
            this.zzdac.zzczw = this.zzdag;
        }
    }
}
