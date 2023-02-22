package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqc implements zzcru<zzcpz> {
    private final zzcvp zzfbb;
    private final zzddl zzfoa;

    public zzcqc(zzddl zzddlVar, zzcvp zzcvpVar) {
        this.zzfoa = zzddlVar;
        this.zzfbb = zzcvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcpz> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcqb
            private final zzcqc zzgfi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfi = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfi.zzamb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcpz zzamb() throws Exception {
        return new zzcpz(this.zzfbb);
    }
}
