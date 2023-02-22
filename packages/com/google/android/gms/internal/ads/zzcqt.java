package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcqt implements zzcru<zzcqu> {
    private final Bundle zzfgs;
    private final zzddl zzfoa;

    public zzcqt(zzddl zzddlVar, Bundle bundle) {
        this.zzfoa = zzddlVar;
        this.zzfgs = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcqu> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcqw
            private final zzcqt zzgfp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfp = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfp.zzame();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcqu zzame() throws Exception {
        return new zzcqu(this.zzfgs);
    }
}
