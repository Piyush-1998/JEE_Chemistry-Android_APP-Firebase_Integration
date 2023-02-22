package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcof implements zzcru<zzcog> {
    private final zzcwe zzfga;
    private final zzddl zzfoa;

    public zzcof(zzddl zzddlVar, zzcwe zzcweVar) {
        this.zzfoa = zzddlVar;
        this.zzfga = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcog> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcoi
            private final zzcof zzgek;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgek = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgek.zzalx();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcog zzalx() throws Exception {
        return new zzcog(this.zzfga.zzgkk);
    }
}
