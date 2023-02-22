package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcql implements zzcru<zzcqm> {
    private final zzddl zzfoa;
    private final Set<String> zzgef;
    private final Context zzlk;

    public zzcql(zzddl zzddlVar, Context context, Set<String> set) {
        this.zzfoa = zzddlVar;
        this.zzlk = context;
        this.zzgef = set;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcqm> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcqo
            private final zzcql zzgfm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfm = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfm.zzamd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcqm zzamd() throws Exception {
        boolean zzd;
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqu)).booleanValue()) {
            zzd = zzcqm.zzd(this.zzgef);
            if (zzd) {
                return new zzcqm(com.google.android.gms.ads.internal.zzq.zzky().getVersion(this.zzlk));
            }
        }
        return new zzcqm(null);
    }
}
