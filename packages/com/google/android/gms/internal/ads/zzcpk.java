package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcpk implements zzcru<zzcpl> {
    private final zzddl zzfoa;
    private final Context zzzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpk(Context context, zzddl zzddlVar) {
        this.zzzc = context;
        this.zzfoa = zzddlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcpl> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcpj
            private final zzcpk zzgfd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfd = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfd.zzama();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcpl zzama() throws Exception {
        com.google.android.gms.ads.internal.zzq.zzkj();
        String zzaz = zzaul.zzaz(this.zzzc);
        com.google.android.gms.ads.internal.zzq.zzkj();
        return new zzcpl(zzaz, zzaul.zzba(this.zzzc));
    }
}
