package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaij implements zzaxz<zzaha> {
    final /* synthetic */ zzaie zzdar;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaij(zzaie zzaieVar) {
        this.zzdar = zzaieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final /* synthetic */ void zzh(zzaha zzahaVar) {
        final zzaha zzahaVar2 = zzahaVar;
        zzaxn.zzdwm.execute(new Runnable(this, zzahaVar2) { // from class: com.google.android.gms.internal.ads.zzaii
            private final zzaij zzdap;
            private final zzaha zzdaq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdap = this;
                this.zzdaq = zzahaVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzavr zzavrVar;
                zzaij zzaijVar = this.zzdap;
                zzaha zzahaVar3 = this.zzdaq;
                zzavrVar = zzaijVar.zzdar.zzczv;
                zzavrVar.zzh(zzahaVar3);
                zzahaVar3.destroy();
            }
        });
    }
}
